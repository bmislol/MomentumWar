package com.momentumwar.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.momentumwar.server.entity.UserStreak;

@Repository
public interface UserStreakRepository extends JpaRepository<UserStreak, Long>{
    
}
