package com.blametech.api_nida.service.impl;

import com.blametech.api_nida.model.dto.req.UserCreateReq;
import com.blametech.api_nida.model.dto.req.UserUpdateReq;
import com.blametech.api_nida.model.dto.res.UserFindRes;
import com.blametech.api_nida.repository.UserRepository;
import com.blametech.api_nida.service.IUserService;
import com.blametech.api_nida.util.mapper.UserMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;

    @Override
    public ResponseEntity<String> createUser(UserCreateReq userCreateReq) {
        userRepository.save(UserMapper.toUserModel(userCreateReq));
        return ResponseEntity.ok("User created successfully");
    }

    @Override
    @Transactional
    public ResponseEntity<String> DeleteUser(UUID id) {
        userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.deleteById(id);
        return ResponseEntity.ok("User deleted successfully");
    }

    @Override
    @Transactional
    public ResponseEntity<String> UpdateUser(UUID id, UserUpdateReq userUpdateReq) {
        var user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        UserMapper.toUserModel(user, userUpdateReq);
        return ResponseEntity.ok("User updated successfully");
    }

    @Override
    public ResponseEntity<UserFindRes> getUser(UUID id) {
        return userRepository.findById(id)
                .map(user -> ResponseEntity.ok(UserMapper.toUserFind(user)))
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
