package it.stefanomilesi.myplatform.repository;

import it.stefanomilesi.myplatform.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, String> {
}
