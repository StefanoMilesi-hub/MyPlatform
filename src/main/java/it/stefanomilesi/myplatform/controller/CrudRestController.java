package it.stefanomilesi.myplatform.controller;

import it.stefanomilesi.myplatform.entity.HasFirebaseKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class CrudRestController<T extends HasFirebaseKey> {

    private final JpaRepository<T, String> repository;

    protected CrudRestController(JpaRepository<T, String> repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<T> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable("id") String id) {
        return ResponseEntity.of(repository.findById(id));
    }

    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity) {
        if (entity.getFirebaseKey() == null || entity.getFirebaseKey().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        if (repository.existsById(entity.getFirebaseKey())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable("id") String id, @RequestBody T entity) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        entity.setFirebaseKey(id);
        return ResponseEntity.ok(repository.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
