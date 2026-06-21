package com.blametech.api_nida.model.dto.res;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record UserFindRes(
        UUID id,

        String username,

        String password,


        String email,

        UUID stage,

        UUID status
) {
}
