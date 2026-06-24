package com.blametech.api_nida.util.mapper;

import com.blametech.api_nida.model.UserEntity;
import com.blametech.api_nida.model.dto.req.UserCreateDtoReq;
import com.blametech.api_nida.model.dto.req.UserUpdateDtoReq;
import com.blametech.api_nida.model.dto.res.UserFindDtoRes;

public class UserMapper {

    private UserMapper() {}

    public static UserEntity toUserEntity(UserCreateDtoReq dto) {
        return UserEntity.builder()
                .username(dto.username())
                .password(dto.password())
                .email(dto.email())
                .stage(dto.stage())
                .status(dto.status())
                .build();
    }

    public static void toUserEntity(UserEntity entity, UserUpdateDtoReq dto) {
        entity.setUsername(dto.username());
        entity.setEmail(dto.email());
    }

    public static UserFindDtoRes toUserFind(UserEntity entity) {
        return new UserFindDtoRes(
                entity.getId(),
                entity.getUsername(),
                entity.getPassword(),
                entity.getEmail(),
                entity.getStage(),
                entity.getStatus()
        );
    }
}
