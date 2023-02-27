package com.soro.ASSURANCE.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soro.ASSURANCE.Entity.*;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
