package com.blametech.api_nida.model.dto.req;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserUpdateDtoReq(
        @NotBlank(message = "O username é obrigatório")
        String username,

        @NotBlank(message = "O email é obrigatório")
        @Email(message = "Formato de email inválido")
        String email
){

}
