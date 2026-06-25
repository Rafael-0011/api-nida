package com.blametech.api_nida.controller.impl;

import com.blametech.api_nida.controller.IUserController;
import com.blametech.api_nida.model.dto.req.UserCreateReq;
import com.blametech.api_nida.model.dto.req.UserUpdateReq;
import com.blametech.api_nida.model.dto.res.UserFindRes;
import com.blametech.api_nida.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController implements IUserController {

    private final IUserService userService;

    @Override
    @PostMapping
    public ResponseEntity<String> createUser(UserCreateReq userCreateReq) {
        return userService.createUser(userCreateReq);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(UUID id, UserUpdateReq userUpdateReq) {
        return userService.UpdateUser(id, userUpdateReq);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(UUID id) {
        return userService.DeleteUser(id);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UserFindRes> findUser(UUID id) {
        return userService.getUser(id);
    }


}
