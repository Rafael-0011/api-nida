package com.blametech.api_nida.util.mapper;


import com.blametech.api_nida.model.UserModel;
import com.blametech.api_nida.model.dto.req.UserCreateReq;
import com.blametech.api_nida.model.dto.req.UserUpdateReq;
import com.blametech.api_nida.model.dto.res.UserFindRes;

public class UserMapper {
    private UserMapper() {}

    public static UserModel toUserModel(UserCreateReq userCreateReq) {
        return UserModel.builder()
                .username(userCreateReq.username())
                .password(userCreateReq.password())
                .email(userCreateReq.email())
                .stage(userCreateReq.stage())
                .status(userCreateReq.status())
                .build();
    }

    public static void toUserModel(UserModel UserModel, UserUpdateReq userUpdateReq) {
        UserModel.setUsername(userUpdateReq.username());
        UserModel.setEmail(userUpdateReq.email());
    }

    public static UserFindRes toUserFind(UserModel userModel) {
        return new UserFindRes(
                userModel.getId(),
                userModel.getUsername(),
                userModel.getPassword(),
                userModel.getEmail(),
                userModel.getStage(),
                userModel.getStatus()
        );
    }
}
