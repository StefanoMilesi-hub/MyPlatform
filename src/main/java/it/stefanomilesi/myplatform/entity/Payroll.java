package it.stefanomilesi.myplatform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "payroll")
@Getter
@Setter
@NoArgsConstructor
public class Payroll implements HasFirebaseKey {

    @Id
    @Column(name = "firebase_key", nullable = false, length = 40)
    private String firebaseKey;

    @Column(name = "bonus_amount", precision = 18, scale = 2)
    private BigDecimal bonusAmount;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    @Column(name = "employee_id", length = 40)
    private String employeeId;

    @Column(name = "encrypted_salary", length = 500)
    private String encryptedSalary;

    @Column(name = "first_name", length = 100)
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(name = "overtime_amount", precision = 18, scale = 2)
    private BigDecimal overtimeAmount;

    @Column(name = "payroll_month", precision = 2)
    private Integer payrollMonth;

    @Column(name = "payroll_year", precision = 4)
    private Integer payrollYear;
}
