package com.blametech.api_nida.repository;

import com.blametech.api_nida.model.VacancyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VacancyRepository extends JpaRepository<VacancyEntity, UUID> {
}
