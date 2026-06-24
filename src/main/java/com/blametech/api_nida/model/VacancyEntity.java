package com.blametech.api_nida.model;

import com.blametech.api_nida.util.shared.Audit;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tb_vacancy")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VacancyEntity extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ui_vacancy_id")
    private UUID id;

    @Column(name = "str_vacancy_name", length = 255)
    private String name;

    @Column(name = "str_vacancy_description", length = 1000)
    private String description;
}
