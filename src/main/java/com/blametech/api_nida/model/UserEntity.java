package com.blametech.api_nida.model;

import com.blametech.api_nida.util.shared.Audit;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tb_user")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends Audit {

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

    @Column(name = "ui_stage_id")
    private UUID stage;

    @Column(name = "ui_status_id")
    private UUID status;
}
