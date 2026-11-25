package it.stefanomilesi.myplatform.controller;

import it.stefanomilesi.myplatform.entity.Role;
import it.stefanomilesi.myplatform.repository.RoleRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/roles")
public class RoleController extends CrudRestController<Role> {

    public RoleController(RoleRepository repository) {
        super(repository);
    }
}
