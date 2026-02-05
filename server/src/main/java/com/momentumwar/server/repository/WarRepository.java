package com.momentumwar.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.momentumwar.server.entity.War;

@Repository
public interface WarRepository extends JpaRepository<War, Long> {
    
}
