package com.momentumwar.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.momentumwar.server.entity.ActivityLog;
import com.momentumwar.server.repository.ActivityLogRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ActivityLogService {
    private final ActivityLogRepository activityLogController;

    public List<ActivityLog> getAllActivityLogs(){
        return activityLogController.findAll();
    }

    public Optional<ActivityLog> getActivityLogById(Long id){
        return activityLogController.findById(id);
    }

    public ActivityLog createActivityLog(ActivityLog activityLog){
        return activityLogController.save(activityLog);
    }

    public void deleteActivityLog(Long id){
        activityLogController.deleteById(id);
    }
}
