package com.blametech.api_nida.model.dto.res;

import java.util.UUID;

public record VacancyFindDtoRes(
        UUID id,
        String name,
        String description
) {
}
