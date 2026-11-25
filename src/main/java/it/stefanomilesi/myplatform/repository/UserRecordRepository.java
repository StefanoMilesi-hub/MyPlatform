package it.stefanomilesi.myplatform.repository;

import it.stefanomilesi.myplatform.entity.UserRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRecordRepository extends JpaRepository<UserRecord, String> {
}
