package it.stefanomilesi.myplatform.repository;

import it.stefanomilesi.myplatform.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
