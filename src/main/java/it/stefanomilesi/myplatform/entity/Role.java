package it.stefanomilesi.myplatform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
public class Role implements HasFirebaseKey {

    @Id
    @Column(name = "firebase_key", nullable = false, length = 40)
    private String firebaseKey;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "role_id", length = 40)
    private String roleId;

    @Column(length = 40)
    private String role;

    @Column(name = "start_date")
    private LocalDate startDate;
}
