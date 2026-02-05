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
public class UserBadgeId {
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "badge_id")
    private Long badgeId;
}
