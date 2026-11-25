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
@Table(name = "joined_roles")
@Getter
@Setter
@NoArgsConstructor
public class JoinedRole implements HasFirebaseKey {

    @Id
    @Column(name = "firebase_key", nullable = false, length = 40)
    private String firebaseKey;

    @Column(precision = 1)
    private Boolean active;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "role_id", length = 40)
    private String roleId;

    @Column(name = "user_id", length = 128)
    private String userId;

    @Column(length = 40)
    private String role;

    @Column(precision = 1)
    private Boolean selected;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "user_email", length = 320)
    private String userEmail;
}
