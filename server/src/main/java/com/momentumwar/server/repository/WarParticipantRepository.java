package com.momentumwar.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.momentumwar.server.entity.WarParticipant;
import com.momentumwar.server.entity.WarParticipantId;

@Repository
public interface WarParticipantRepository extends JpaRepository<WarParticipant, WarParticipantId>{
    
}
