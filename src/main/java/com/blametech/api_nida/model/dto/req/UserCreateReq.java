package com.blametech.api_nida.model.dto.req;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record UserCreateReq(
        @NotBlank(message = "O username é obrigatório")
        String username,

        @NotBlank(message = "A senha é obrigatória")
        String password,

        @NotBlank(message = "O email é obrigatório")
        @Email(message = "Formato de email inválido")
        String email,

        @NotNull(message = "O stage é obrigatório")
        UUID stage,

        @NotNull(message = "O status é obrigatório")
        UUID status
) {}
