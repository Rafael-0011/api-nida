
-- 1. TABELA DE DOCUMENTOS
CREATE TABLE IF NOT EXISTS tb_document (
    ui_document_id uuid PRIMARY KEY,
    str_document_name VARCHAR(255)
);

-- 2. TABELA DE ESTÁGIOS DO USUÁRIO
CREATE TABLE IF NOT EXISTS tb_stage (
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
CREATE TABLE IF NOT EXISTS tb_status (
    ui_status_id uuid PRIMARY KEY,
    str_status_name VARCHAR(50)
);

-- 5. TABELA DE USUÁRIOS
CREATE TABLE IF NOT EXISTS tb_user (
    ui_user_id uuid PRIMARY KEY,
    str_user_username VARCHAR(255),
    str_user_password VARCHAR(255),
    str_user_email VARCHAR(255) UNIQUE,
    ui_stage_id uuid,
    ui_status_id uuid,
    dat_created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    dat_updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (ui_stage_id) REFERENCES tb_stage (ui_stage_id),
    FOREIGN KEY (ui_status_id) REFERENCES tb_status (ui_status_id)

    );

INSERT INTO tb_stage (ui_stage_id, str_stage_name) VALUES
(gen_random_uuid(), 'Onboarding'),
(gen_random_uuid(), 'Treinamento'),
(gen_random_uuid(), 'Ativo'),
(gen_random_uuid(), 'Inativo');

-- Inserts para a tabela tb_status_user (Status do Usuário)
INSERT INTO tb_status (ui_status_id, str_status_name) VALUES
(gen_random_uuid(), 'Ativo'),
(gen_random_uuid(), 'Pendente'),
(gen_random_uuid(), 'Bloqueado');

