package com.momentumwar.server.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "war_participants")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WarParticipant {
    @EmbeddedId
    private WarParticipantId id;
}
