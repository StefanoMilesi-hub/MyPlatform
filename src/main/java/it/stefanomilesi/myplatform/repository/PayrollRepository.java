package it.stefanomilesi.myplatform.repository;

import it.stefanomilesi.myplatform.entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollRepository extends JpaRepository<Payroll, String> {
}
