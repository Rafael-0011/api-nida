package com.blametech.api_nida.model.dto.res;

import java.util.UUID;

public record UserFindDtoRes(
        UUID id,
        String username,
        String password,
        String email,
        UUID stage,
        UUID status
) {
}
