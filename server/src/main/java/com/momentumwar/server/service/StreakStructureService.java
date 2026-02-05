package com.momentumwar.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.momentumwar.server.entity.StreakStructure;
import com.momentumwar.server.repository.StreakStructureRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StreakStructureService {
    private final StreakStructureRepository streakStructureRepository;

    public List<StreakStructure> getAllStreakStructures() {
        return streakStructureRepository.findAll();
    }

    public Optional<StreakStructure> getStreakStructureById(Long id) {
        return streakStructureRepository.findById(id);
    }

    public StreakStructure saveStreakStructure(StreakStructure streakStructure) {
        return streakStructureRepository.save(streakStructure);
    }

    public void deleteStreakStructure(Long id) {
        streakStructureRepository.deleteById(id);
    }
}
