package com.blametech.api_nida.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ui_user_id")
    private UUID id;

    @Column(name = "str_user_username", length = 255)
    private String username;

    @Column(name = "str_user_password", length = 255)
    private String password;

    @Column(name = "str_user_email", unique = true, length = 255)
    private String email;

    @OneToOne
    @JoinColumn(name = "ui_stage_user_id", referencedColumnName = "ui_stage_id")
    private StageUserModel stageUserModel;

    @OneToOne
    @JoinColumn(name = "ui_status_user_id", referencedColumnName = "ui_status_id")
    private StatusUser status;

    @Column(name = "dat_user_created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "dat_user_updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
