package it.stefanomilesi.myplatform.repository;

import it.stefanomilesi.myplatform.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
