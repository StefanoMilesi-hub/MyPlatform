package it.stefanomilesi.myplatform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "videos")
@Getter
@Setter
@NoArgsConstructor
public class Video implements HasFirebaseKey {

    @Id
    @Column(name = "firebase_key", nullable = false, length = 40)
    private String firebaseKey;

    @Column(length = 100)
    private String category;

    @Column(length = 1000)
    private String description;

    @Column(name = "file_name", length = 255)
    private String fileName;

    @Column(name = "file_url", length = 2048)
    private String fileUrl;

    @Column(length = 255)
    private String title;
}
