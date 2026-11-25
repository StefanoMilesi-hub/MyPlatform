package it.stefanomilesi.myplatform.repository;

import it.stefanomilesi.myplatform.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, String> {
}
