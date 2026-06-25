package com.blametech.api_nida.controller.impl;

import com.blametech.api_nida.controller.IVacancyController;
import com.blametech.api_nida.model.dto.req.VacancyCreateDtoReq;
import com.blametech.api_nida.model.dto.req.VacancyUpdateDtoReq;
import com.blametech.api_nida.model.dto.res.VacancyFindDtoRes;
import com.blametech.api_nida.service.IVacancyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/vacancy")
@RequiredArgsConstructor
public class VacancyController implements IVacancyController {

    private final IVacancyService vacancyService;

    @Override
    @PostMapping
    public ResponseEntity<String> createVacancy(@RequestBody VacancyCreateDtoReq vacancyCreateDtoReq) {
        return vacancyService.createVacancy(vacancyCreateDtoReq);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<String> UpdateVacancy(@PathVariable UUID id, @RequestBody VacancyUpdateDtoReq vacancyUpdateDtoReq) {
        return vacancyService.updateVacancy(id, vacancyUpdateDtoReq);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<VacancyFindDtoRes> getVacancy(@PathVariable UUID id) {
        return vacancyService.getVacancy(id);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVacancy(@PathVariable UUID id) {
        return vacancyService.deleteVacancy(id);
    }
}
