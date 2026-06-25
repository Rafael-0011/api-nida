package com.blametech.api_nida.model.dto.req;

import jakarta.validation.constraints.NotBlank;

public record VacancyCreateDtoReq(
        @NotBlank(message = "O name é obrigatório")
        String name,
        @NotBlank(message = "O description é obrigatório")
        String description
) {
}
