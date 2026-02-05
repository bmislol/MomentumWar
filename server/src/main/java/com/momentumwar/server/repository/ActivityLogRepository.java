package com.momentumwar.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.momentumwar.server.entity.ActivityLog;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityLogRepository extends JpaRepository<ActivityLog, Long> {
    
}
