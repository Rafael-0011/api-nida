package com.blametech.api_nida.repository;

import com.blametech.api_nida.model.DocumentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DocumentRepository extends JpaRepository<DocumentModel, UUID> {
}
