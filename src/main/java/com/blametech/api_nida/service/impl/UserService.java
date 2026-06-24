package com.blametech.api_nida.service.impl;

import com.blametech.api_nida.model.dto.req.UserCreateDtoReq;
import com.blametech.api_nida.model.dto.req.UserUpdateDtoReq;
import com.blametech.api_nida.model.dto.res.UserFindDtoRes;
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
    public ResponseEntity<String> createUser(UserCreateDtoReq userCreateDtoReq) {
        userRepository.save(UserMapper.toUserEntity(userCreateDtoReq));
        return ResponseEntity.ok("User created successfully");
    }

    @Override
    @Transactional
    public ResponseEntity<String> UpdateUser(UUID id, UserUpdateDtoReq userUpdateDtoReq) {
        var user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        UserMapper.toUserEntity(user, userUpdateDtoReq);
        return ResponseEntity.ok("User updated successfully");
    }

    @Override
    public ResponseEntity<UserFindDtoRes> getUser(UUID id) {
        return userRepository.findById(id)
                .map(user -> ResponseEntity.ok(UserMapper.toUserFind(user)))
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    @Transactional
    public ResponseEntity<String> DeleteUser(UUID id) {
        userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.deleteById(id);
        return ResponseEntity.ok("User deleted successfully");
    }
}
