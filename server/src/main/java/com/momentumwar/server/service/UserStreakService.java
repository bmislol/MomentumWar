package com.momentumwar.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.momentumwar.server.entity.UserStreak;
import com.momentumwar.server.repository.UserStreakRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserStreakService {
    private final UserStreakRepository userStreakRepository;

    public List<UserStreak> getAllUserStreaks(){
        return userStreakRepository.findAll();
    }

    public Optional<UserStreak> getUserStreakById(Long id){
        return userStreakRepository.findById(id); 
    }

    public UserStreak savUserStreak(UserStreak userStreak){
        return userStreakRepository.save(userStreak);
    }

    public void deleteUserStreak(Long id){
        userStreakRepository.deleteById(id);
    }
}
