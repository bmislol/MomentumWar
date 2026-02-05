package com.momentumwar.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.momentumwar.server.entity.UserSetting;
import com.momentumwar.server.entity.UserSettingId;

@Repository
public interface UserSettingRepository extends JpaRepository<UserSetting, UserSettingId>{
    
}
