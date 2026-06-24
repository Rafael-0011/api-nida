package com.blametech.api_nida.service.impl;

import com.blametech.api_nida.model.dto.req.VacancyCreateDtoReq;
import com.blametech.api_nida.model.dto.req.VacancyUpdateDtoReq;
import com.blametech.api_nida.model.dto.res.VacancyFindDtoRes;
import com.blametech.api_nida.repository.VacancyRepository;
import com.blametech.api_nida.service.IVacancyService;
import com.blametech.api_nida.util.mapper.VacancyMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class VacancyService implements IVacancyService {

    private final VacancyRepository vacancyRepository;

    @Override
    public ResponseEntity<String> createVacancy(VacancyCreateDtoReq vacancyCreateDtoReq) {
        vacancyRepository.save(VacancyMapper.toVacancyEntity(vacancyCreateDtoReq));
        return ResponseEntity.ok("Vacancy created successfully");
    }

    @Override
    @Transactional
    public ResponseEntity<String> updateVacancy(UUID id, VacancyUpdateDtoReq vacancyUpdateDtoReq) {
        var vacancy = vacancyRepository.findById(id).orElseThrow(() -> new RuntimeException("Vacancy not found"));
        VacancyMapper.toVacancyEntity(vacancy,vacancyUpdateDtoReq);
        return null;
    }

    @Override
    public ResponseEntity<VacancyFindDtoRes> getVacancy(UUID id) {
        return vacancyRepository.findById(id)
                .map(i -> ResponseEntity.ok(VacancyMapper.toVacancyFind(i)))
                .orElseThrow(() -> new RuntimeException("Vacancy not found"));
    }

    @Override
    public ResponseEntity<String> deleteVacancy(UUID id) {
        vacancyRepository.deleteById(id);
        return ResponseEntity.ok("Vacancy deleted successfully");
    }
}
