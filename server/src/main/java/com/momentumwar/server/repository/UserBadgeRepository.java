package com.momentumwar.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.momentumwar.server.entity.UserBadge;
import com.momentumwar.server.entity.UserBadgeId;

@Repository
public interface UserBadgeRepository extends JpaRepository<UserBadge, UserBadgeId>{
    
}
