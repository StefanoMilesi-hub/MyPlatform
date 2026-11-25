package it.stefanomilesi.myplatform.controller;

import it.stefanomilesi.myplatform.entity.Payroll;
import it.stefanomilesi.myplatform.repository.PayrollRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payroll")
public class PayrollController extends CrudRestController<Payroll> {

    public PayrollController(PayrollRepository repository) {
        super(repository);
    }
}
