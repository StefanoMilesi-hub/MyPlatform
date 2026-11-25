package it.stefanomilesi.myplatform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@Entity
@Table(name = "assets")
@Getter
@Setter
@NoArgsConstructor
public class Asset implements HasFirebaseKey {

    @Id
    @Column(name = "firebase_key", nullable = false, length = 40)
    private String firebaseKey;

    @Column(name = "asset_id", length = 20)
    private String assetId;

    @Column(name = "asset_type", length = 80)
    private String assetType;

    @Column(name = "assigned_user", length = 200)
    private String assignedUser;

    @Column(length = 100)
    private String brand;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    @Column(length = 120)
    private String model;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @Column(name = "serial_number", length = 100)
    private String serialNumber;

    @Column(length = 40)
    private String status;
}
