package com.momentumwar.server.service;

import java.util.List;
import java.util.Optional;

import com.momentumwar.server.entity.Badge;
import com.momentumwar.server.repository.BadgeRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BadgeService {
    private final BadgeRepository badgeRepository;

    public List<Badge> getAllBadges() {
        return badgeRepository.findAll();
    }

    public Optional<Badge> getBadgeById(Long id) {
        return badgeRepository.findById(id);
    }

    public Badge createBadge(Badge badge) {
        return badgeRepository.save(badge);
    }

    public void deleteBadge(Long id) {
        badgeRepository.deleteById(id);
    }
}
