package com.momentumwar.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.momentumwar.server.entity.UserSetting;
import com.momentumwar.server.entity.UserSettingId;
import com.momentumwar.server.repository.UserSettingRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserSettingSettings {
    private final UserSettingRepository userSettingRepository;

    public List<UserSetting> getAllUserSettings(){
        return userSettingRepository.findAll();
    }

    public Optional<UserSetting> getUserSettingById(UserSettingId id){
        return userSettingRepository.findById(id);
    }

    public UserSetting saveUserSetting(UserSetting userSetting){
        return userSettingRepository.save(userSetting);
    }

    public void deleteUserSetting(UserSettingId id){
        userSettingRepository.deleteById(id);
    }
}
