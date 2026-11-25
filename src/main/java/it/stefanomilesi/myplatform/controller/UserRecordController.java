package it.stefanomilesi.myplatform.controller;

import it.stefanomilesi.myplatform.entity.UserRecord;
import it.stefanomilesi.myplatform.repository.UserRecordRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserRecordController extends CrudRestController<UserRecord> {

    public UserRecordController(UserRecordRepository repository) {
        super(repository);
    }
}
