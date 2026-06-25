package com.blametech.api_nida.controller;

import com.blametech.api_nida.model.dto.req.VacancyCreateDtoReq;
import com.blametech.api_nida.model.dto.req.VacancyUpdateDtoReq;
import com.blametech.api_nida.model.dto.res.VacancyFindDtoRes;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface IVacancyController {
    ResponseEntity<String> createVacancy(VacancyCreateDtoReq vacancyCreateDtoReq);
    ResponseEntity<String> UpdateVacancy(UUID id, VacancyUpdateDtoReq vacancyUpdateDtoReq);
    ResponseEntity<VacancyFindDtoRes> getVacancy(UUID id);
    ResponseEntity<String> deleteVacancy(UUID id);

}
