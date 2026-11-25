package it.stefanomilesi.myplatform.controller;

import it.stefanomilesi.myplatform.entity.Stat;
import it.stefanomilesi.myplatform.repository.StatRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stats")
public class StatController extends CrudRestController<Stat> {

    public StatController(StatRepository repository) {
        super(repository);
    }
}
