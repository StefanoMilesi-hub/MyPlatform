package it.stefanomilesi.myplatform.controller;

import it.stefanomilesi.myplatform.entity.Document;
import it.stefanomilesi.myplatform.repository.DocumentRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/documents")
public class DocumentController extends CrudRestController<Document> {

    public DocumentController(DocumentRepository repository) {
        super(repository);
    }
}
