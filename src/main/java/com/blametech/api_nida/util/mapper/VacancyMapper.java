package com.blametech.api_nida.util.mapper;

import com.blametech.api_nida.model.VacancyEntity;
import com.blametech.api_nida.model.dto.req.VacancyCreateDtoReq;
import com.blametech.api_nida.model.dto.req.VacancyUpdateDtoReq;
import com.blametech.api_nida.model.dto.res.VacancyFindDtoRes;

public class VacancyMapper {

    private VacancyMapper() {}

    public static VacancyEntity toVacancyEntity(VacancyCreateDtoReq dto) {
        return VacancyEntity.builder()
                .name(dto.name())
                .description(dto.description())
                .build();
    }

    public static void toVacancyEntity(VacancyEntity entity, VacancyUpdateDtoReq dto) {
        entity.setName(dto.name());
        entity.setDescription(dto.description());
    }

    public static VacancyFindDtoRes toVacancyFind(VacancyEntity entity) {
        return new VacancyFindDtoRes(
                entity.getId(),
                entity.getName(),
                entity.getDescription()
        );
    }


}
