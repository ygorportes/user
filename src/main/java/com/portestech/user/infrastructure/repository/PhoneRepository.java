package com.portestech.user.infrastructure.repository;

import com.portestech.user.infrastructure.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
