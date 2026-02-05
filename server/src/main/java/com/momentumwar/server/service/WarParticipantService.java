package com.momentumwar.server.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.momentumwar.server.entity.WarParticipant;
import com.momentumwar.server.entity.WarParticipantId;
import com.momentumwar.server.repository.WarParticipantRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WarParticipantService {
    private final WarParticipantRepository warParticipantRepository;

    public Optional<WarParticipant> getParticipant(WarParticipantId id) {
        return warParticipantRepository.findById(id);
    }

    public WarParticipant addParticipantToWar(WarParticipant participant) {
        return warParticipantRepository.save(participant);
    }

    public void removeParticipant(WarParticipantId id) {
        warParticipantRepository.deleteById(id);
    }
}