package com.momentumwar.server.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WarParticipantId {
    @Column(name = "war_id")
    private Long warId;

    @Column(name = "user_id")
    private Long userId;
}
