package com.momentumwar.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.momentumwar.server.entity.StreakStructure;

@Repository
public interface StreakStructureRepository extends JpaRepository<StreakStructure, Long>{
    
}
