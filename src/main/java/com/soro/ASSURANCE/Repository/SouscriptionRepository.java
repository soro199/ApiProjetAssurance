package com.soro.ASSURANCE.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soro.ASSURANCE.Entity.Souscription;

@Repository
public interface SouscriptionRepository  extends JpaRepository<Souscription, Long>{

}
