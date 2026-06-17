
-- 1. TABELA DE DOCUMENTOS
CREATE TABLE IF NOT EXISTS tb_document (
    ui_document_id uuid PRIMARY KEY,
    str_document_name VARCHAR(255)
);

-- 2. TABELA DE ESTÁGIOS DO USUÁRIO
CREATE TABLE IF NOT EXISTS tb_stage_user (
    ui_stage_id uuid PRIMARY KEY,
    str_stage_name VARCHAR(255)
);

-- 2. TABELA DE VAGAS (Ajustado o nome de 'vacancy')
CREATE TABLE IF NOT EXISTS tb_vacancy (
    ui_vacancy_id uuid PRIMARY KEY,
    str_vacancy_name VARCHAR(255),
    str_vacancy_description TEXT
);

-- 4. TABELA DE STATUS DO USUÁRIO
CREATE TABLE IF NOT EXISTS tb_status_user (
    ui_status_id uuid PRIMARY KEY,
    str_status_name VARCHAR(50)
);

-- 5. TABELA DE USUÁRIOS
CREATE TABLE IF NOT EXISTS tb_user (
    ui_user_id uuid PRIMARY KEY,
    str_user_username VARCHAR(255),
    str_user_password VARCHAR(255),
    str_user_email VARCHAR(255) UNIQUE,
    ui_stage_user_id uuid,
    ui_status_user_id uuid,
    dat_user_created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    dat_user_updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (ui_stage_user_id) REFERENCES tb_stage_user (ui_stage_id),
    FOREIGN KEY (ui_status_user_id) REFERENCES tb_status_user (ui_status_id)

    );

