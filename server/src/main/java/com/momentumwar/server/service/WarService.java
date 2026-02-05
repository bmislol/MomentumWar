package com.momentumwar.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.momentumwar.server.entity.War;
import com.momentumwar.server.repository.WarRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WarService {
    private final WarRepository warRepository;

    public List<War> getAllWars() {
        return warRepository.findAll();
    }

    public Optional<War> getWarById(Long id) {
        return warRepository.findById(id);
    }

    public War createWar(War war) {
        return warRepository.save(war);
    }

    public void deleteWar(Long id) {
        warRepository.deleteById(id);
    }
}
