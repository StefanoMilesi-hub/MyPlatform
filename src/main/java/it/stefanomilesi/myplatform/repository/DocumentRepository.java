package it.stefanomilesi.myplatform.repository;

import it.stefanomilesi.myplatform.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, String> {
}
