package it.stefanomilesi.myplatform.controller;

import it.stefanomilesi.myplatform.entity.JoinedRole;
import it.stefanomilesi.myplatform.repository.JoinedRoleRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/joined-roles")
public class JoinedRoleController extends CrudRestController<JoinedRole> {

    public JoinedRoleController(JoinedRoleRepository repository) {
        super(repository);
    }
}
