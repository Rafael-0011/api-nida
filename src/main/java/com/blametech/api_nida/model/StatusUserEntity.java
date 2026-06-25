package com.blametech.api_nida.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_status_user")
public class StatusUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ui_status_id")
    private UUID id;

    @Column(name = "str_status_name", length = 50)
    private String name;

}
