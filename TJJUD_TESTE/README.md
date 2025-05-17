# 📚 Projeto Cadastro de Livros

## Sumário
1. Tecnologias Utilizadas
2. Estrutura do Projeto
3. Configuração do Banco de Dados
4. Backend (Spring Boot)
5. Frontend (Angular)
6. Relatórios (JasperReports)
7. Testes (TDD)
8. Execução do Projeto
9. Scripts de Implantação
10. Observações e Boas Práticas

---

## 1. Tecnologias Utilizadas
- Backend: Java 17+, Spring Boot, Spring Data JPA, JasperReports, Maven
- Frontend: Angular 16+, Bootstrap 5
- Banco de Dados: PostgreSQL
- Testes: JUnit, Mockito
- Relatórios: JasperReports (PDF)
- Ferramentas: Docker (opcional), Postman

---

## 2. Estrutura do Projeto
```
cadastro-livros/
│
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/exemplo/livros/
│   │   │   │   ├── controller/
│   │   │   │   ├── dto/
│   │   │   │   ├── model/
│   │   │   │   ├── repository/
│   │   │   │   ├── service/
│   │   │   │   └── exception/
│   │   │   ├── resources/
│   │   │   │   ├── application.properties
│   │   │   │   └── relatorioLivros.jrxml
│   │   └── test/
│   │       └── java/com/exemplo/livros/
│   │           ├── service/
│   │           └── repository/
│   └── pom.xml
│
├── frontend/
│   ├── src/
│   │   ├── app/
│   │   │   ├── components/
│   │   │   │   ├── livro/
│   │   │   │   ├── autor/
│   │   │   │   └── assunto/
│   │   │   ├── services/
│   │   │   └── app.module.ts
│   └── package.json
│
└── scripts/
    ├── 01_create_tables.sql
    ├── 02_create_view.sql
    └── 03_insert_sample_data.sql
```

---

## 3. Configuração do Banco de Dados
Os scripts de criação das tabelas, view e dados de exemplo estão na pasta `/scripts`.

---

## 4. Backend (Spring Boot)
O backend está na pasta `/backend` e utiliza Java 17+, Spring Boot, JPA e JasperReports.

---

## 5. Frontend (Angular)
O frontend está na pasta `/frontend` e utiliza Angular 16+ e Bootstrap 5.

---

## 6. Relatórios (JasperReports)
O relatório é gerado em PDF a partir de uma view no banco de dados.

---

## 7. Testes (TDD)
Testes unitários e de integração estão presentes nas camadas de serviço e repositório.

---

## 8. Execução do Projeto
Veja instruções detalhadas nas seções de backend, frontend e scripts.

---

## 9. Scripts de Implantação
Scripts SQL para criação do banco, view e dados de exemplo estão em `/scripts`.

---

## 10. Observações e Boas Práticas
- Validação e tratamento de erros em todas as camadas.
- Mensagens claras para o usuário.
- Relatório agrupando por autor.
- TDD aplicado nos serviços principais.
- Bootstrap para responsividade.
- Documentação clara para facilitar implantação e manutenção. 