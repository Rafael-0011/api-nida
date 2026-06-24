package com.blametech.api_nida.service;

import com.blametech.api_nida.model.dto.req.UserCreateDtoReq;
import com.blametech.api_nida.model.dto.req.UserUpdateDtoReq;
import com.blametech.api_nida.model.dto.res.UserFindDtoRes;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface IUserService {
    ResponseEntity<String> createUser(UserCreateDtoReq userCreateReq);
    ResponseEntity<String> UpdateUser(UUID id, UserUpdateDtoReq userUpdateDtoReq);
    ResponseEntity<UserFindDtoRes> getUser(UUID id);
    ResponseEntity<String> DeleteUser(UUID id);
}
