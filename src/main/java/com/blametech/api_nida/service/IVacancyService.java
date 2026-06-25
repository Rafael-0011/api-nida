package com.blametech.api_nida.service;

import com.blametech.api_nida.model.dto.req.VacancyCreateDtoReq;
import com.blametech.api_nida.model.dto.req.VacancyUpdateDtoReq;
import com.blametech.api_nida.model.dto.res.VacancyFindDtoRes;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface IVacancyService {
    ResponseEntity<String> createVacancy(VacancyCreateDtoReq vacancyCreateDtoReq);
    ResponseEntity<String> updateVacancy(UUID id, VacancyUpdateDtoReq vacancyUpdateDtoReq);
    ResponseEntity<VacancyFindDtoRes> getVacancy(UUID id);
    ResponseEntity<String> deleteVacancy(UUID id);

}
