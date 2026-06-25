package com.blametech.api_nida.controller;

import com.blametech.api_nida.model.dto.req.UserCreateReq;
import com.blametech.api_nida.model.dto.req.UserUpdateReq;
import com.blametech.api_nida.model.dto.res.UserFindRes;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

public interface IUserController {
    ResponseEntity<String> createUser(@RequestBody UserCreateReq userCreateReq);

    ResponseEntity<String> updateUser(@PathVariable UUID id, @RequestBody UserUpdateReq userUpdateReq);

    ResponseEntity<String> deleteUser(@PathVariable UUID id);

    ResponseEntity<UserFindRes> findUser(@PathVariable UUID id);
}
