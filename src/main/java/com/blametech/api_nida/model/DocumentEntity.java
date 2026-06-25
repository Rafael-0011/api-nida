package com.blametech.api_nida.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_document")
public class DocumentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ui_document_id")
    private UUID id;

    @Column(name = "str_document_name", length = 255)
    private String name;

}
