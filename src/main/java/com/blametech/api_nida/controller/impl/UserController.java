package com.blametech.api_nida.controller.impl;

import com.blametech.api_nida.controller.IUserController;
import com.blametech.api_nida.model.dto.req.UserCreateDtoReq;
import com.blametech.api_nida.model.dto.req.UserUpdateDtoReq;
import com.blametech.api_nida.model.dto.res.UserFindDtoRes;
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
    public ResponseEntity<String> createUser(@RequestBody UserCreateDtoReq userCreateReq) {
        return userService.createUser(userCreateReq);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable UUID id, @RequestBody UserUpdateDtoReq userUpdateDtoReq) {
        return userService.UpdateUser(id, userUpdateDtoReq);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable UUID id) {
        return userService.DeleteUser(id);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UserFindDtoRes> findUser(@PathVariable UUID id) {
        return userService.getUser(id);
    }


}
