package it.stefanomilesi.myplatform.repository;

import it.stefanomilesi.myplatform.entity.Stat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatRepository extends JpaRepository<Stat, String> {
}
