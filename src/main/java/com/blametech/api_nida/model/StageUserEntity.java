package com.blametech.api_nida.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_stage_user")
public class StageUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ui_stage_id")
    private UUID id;

    @Column(name = "str_stage_name", length = 255)
    private String name;
    
}
