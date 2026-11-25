package it.stefanomilesi.myplatform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "stats")
@Getter
@Setter
@NoArgsConstructor
public class Stat implements HasFirebaseKey {

    @Id
    @Column(name = "firebase_key", nullable = false, length = 40)
    private String firebaseKey;

    @Column(name = "change_value", precision = 18, scale = 4)
    private BigDecimal changeValue;

    @Column(length = 40)
    private String color;

    @Column(precision = 1)
    private Boolean deleted;

    @Column(length = 32)
    private String icon;

    @Column(name = "stat_id", length = 40)
    private String statId;

    @Column(length = 255)
    private String title;

    @Column(name = "stat_type", length = 40)
    private String statType;

    @Column(length = 100)
    private String value;
}
