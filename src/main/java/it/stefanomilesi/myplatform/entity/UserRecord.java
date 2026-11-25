package it.stefanomilesi.myplatform.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class UserRecord implements HasFirebaseKey {

    @Id
    @Column(name = "firebase_key", nullable = false, length = 128)
    private String firebaseKey;

    @Column(name = "expiration_date")
    private OffsetDateTime expirationDate;

    @Column(length = 1000)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String token;

    @Column(name = "active_role", length = 40)
    private String activeRole;

    @Column(length = 320)
    private String email;

    @Column(name = "user_id", length = 128)
    private String userId;
}
