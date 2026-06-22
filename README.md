# Nida – Sistema Integrado de Gestão de RH e Onboarding 🚀

O **Nida** é uma solução Full Stack desenvolvida para centralizar, organizar e facilitar a comunicação entre o setor de Recursos Humanos (recrutadores) e os colaboradores (candidatos e funcionários). 

A plataforma resolve o problema de processos admissionais descentralizados, permitindo que o candidato, logo após receber o feedback positivo, realize seu pré-cadastro, envie documentos essenciais e acompanhe sua evolução de carreira e o dia a dia na empresa em um único lugar.

---

## 💻 Sobre o Projeto & Fluxo de Negócio

1. **Acesso do Candidato/Funcionário:** Ao avançar no processo seletivo, o profissional recebe um link exclusivo para cadastrar seus dados e documentos de contratação.
2. **Portal do Colaborador:** Uma vez contratado, o usuário tem acesso ao painel onde pode visualizar datas de reuniões, entrevistas, acompanhar vagas internas para evolução de carreira e enviar atestados médicos diretamente para validação do RH.
3. **Painel do RH:** O recrutador consegue gerenciar o funil de contratação, alterar o *stage* (status) do usuário (ex: de *Candidato* para *Empregado*), validar documentos/atestados enviados e disparar e-mails automáticos de comunicação.

---

## 🛠️ Stack Tecnológica

### Backend (Em produção/finalizado)
*   **Java 17** & **Spring Boot**
*   **Spring Security & JWT** (Autenticação e controle de acessos baseados em perfis: ROLE_RH, ROLE_USER)
*   **PostgreSQL** (Banco de dados relacional para persistência de dados e históricos)
*   **Flyway** (Gerenciamento e versionamento de schemas de banco)

### Frontend (Em desenvolvimento)
*   **Angular** (Construção de uma SPA responsiva com dashboards administrativos)
*   **TypeScript** & **RxJS**

---

## 🗺️ Roadmap de Desenvolvimento (Status do Projeto)

O projeto está sendo construído em módulos, seguindo boas práticas de arquitetura e Clean Code.

- [x] **Módulo de Autenticação:** Configuração do Spring Security + JWT para segurança das rotas.
- [x] **Modelagem de Dados:** Criação das tabelas de Usuários, Vagas, Stages e Documentos via Flyway.
- [x] **API de Endpoints (Backend):** CRUD de vagas, controle de status do funcionário e rotas de comunicação.
- [ ] **Upload de Arquivos (Em progresso):** Implementação do fluxo para armazenamento e validação de documentos admissionais e atestados.
- [ ] **Interface Web (Angular):** Desenvolvimento do dashboard do RH e a tela de perfil do funcionário.
- [ ] **Módulo de Notificação:** Integração com serviço de envio de e-mails para agendamentos e feedbacks.
