package it.stefanomilesi.myplatform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "items")
@Getter
@Setter
@NoArgsConstructor
public class Item implements HasFirebaseKey {

    @Id
    @Column(name = "firebase_key", nullable = false, length = 40)
    private String firebaseKey;

    @Column(name = "item_date")
    private LocalDate itemDate;

    @Column(precision = 1)
    private Boolean deleted;

    @Column(name = "item_id", length = 40)
    private String itemId;

    @Column(length = 255)
    private String name;

    @Column(length = 40)
    private String status;

    @Column(name = "item_type", length = 40)
    private String itemType;

    @Column(precision = 18, scale = 4)
    private BigDecimal value;
}
