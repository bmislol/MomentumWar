package com.momentumwar.server.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.momentumwar.server.entity.UserBadge;
import com.momentumwar.server.entity.UserBadgeId;
import com.momentumwar.server.repository.UserBadgeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserBadgeService {
    private final UserBadgeRepository userBadgeRepository;

    public List<UserBadge> getUserAllBadges(Long userId) {
        return userBadgeRepository.findAll();
    }

    public Optional<UserBadge> getUserBadgeById(UserBadgeId id) {
        return userBadgeRepository.findById(id);
    }

    public UserBadge saveUserBadge(UserBadge userBadge) {
        return userBadgeRepository.save(userBadge);
    }

    public void deleteUserBadge(UserBadgeId id) {
        userBadgeRepository.deleteById(id);
    }
}
