package com.momentumwar.server.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "streak_structures")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StreakStructure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "required_count", nullable = false)
    private int requiredCount;

    @Column(name = "period_type", nullable = false)
    private String periodType;

    @Column(name = "user_id", nullable = false)
    private Long userId;

}
