package com.blametech.api_nida.controller;

import com.blametech.api_nida.model.dto.req.UserCreateDtoReq;
import com.blametech.api_nida.model.dto.req.UserUpdateDtoReq;
import com.blametech.api_nida.model.dto.res.UserFindDtoRes;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface IUserController {
    ResponseEntity<String> createUser(UserCreateDtoReq userCreateDtoReq);
    ResponseEntity<String> updateUser(UUID id, UserUpdateDtoReq userUpdateDtoReq);
    ResponseEntity<String> deleteUser(UUID id);
    ResponseEntity<UserFindDtoRes> findUser(UUID id);
}
