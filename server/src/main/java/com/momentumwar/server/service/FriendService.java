package com.momentumwar.server.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.momentumwar.server.entity.Friend;
import com.momentumwar.server.repository.FriendRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;

    public List<Friend> getAllFriends(){
        return friendRepository.findAll();
    }

    public Friend getFriendById(Long id){
        return friendRepository.findById(id).orElse(null);
    }

    public Friend createFriend(Friend friend){
        return friendRepository.save(friend);
    }

    public void deleteFriend(Long id){
        friendRepository.deleteById(id);
    }
}
