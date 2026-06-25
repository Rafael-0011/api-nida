package com.blametech.api_nida.service;

import com.blametech.api_nida.model.dto.req.UserCreateReq;
import com.blametech.api_nida.model.dto.req.UserUpdateReq;
import com.blametech.api_nida.model.dto.res.UserFindRes;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface IUserService {
    ResponseEntity<String> createUser(UserCreateReq userCreateReq);

    ResponseEntity<String> DeleteUser(UUID id);

    ResponseEntity<String> UpdateUser(UUID id, UserUpdateReq userUpdateReq);

    ResponseEntity<UserFindRes> getUser(UUID id);
}
