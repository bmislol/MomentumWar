package com.momentumwar.server.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_settings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSetting {
    @EmbeddedId
    private UserSettingId id;

    @Column(name = "is_private_profile", nullable = false)
    private boolean isPrivateProfile;

    @Column(name = "is_notification_enabled", nullable = false)
    private boolean isNotificationEnabled;

    @Column(name = "theme_preference", nullable = false)
    private String themePreference;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime updatedAt;

}
