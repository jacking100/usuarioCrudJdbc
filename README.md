CRUD de Usuário - Java + PostgreSQL (Docker)

Este projeto é um CRUD simples de Usuário feito em Java POO puro com JDBC, utilizando o PostgreSQL em container Docker.
Inclui operações básicas de cadastrar, listar, atualizar e excluir usuários diretamente no banco de dados.

🛠️ Tecnologias utilizadas

    Java 17+

    JDBC (Java Database Connectivity)

    PostgreSQL 16 (via Docker)

    Docker Compose

📂 Estrutura do projeto

usuario-crud-jdbc/
├─ docker-compose.yml
├─ lib/                  # Driver JDBC do PostgreSQL
├─ src/
│  ├─ entities/Usuario.java
│  ├─ factory/ConnectionFactory.java
│  ├─ repository/UsuarioRepository.java
│  ├─ controller/UsuarioController.java
│  ├─ principal/App.java
│  └─ scripts.sql


📜 Funcionalidades

    Cadastrar usuário (nome, e-mail e senha)

    Listar todos os usuários

    Atualizar usuário existente

    Excluir usuário pelo ID

📸 Exemplo de execução (terminal)

==== MENU USUÁRIO ====
1 - Cadastrar
2 - Listar
3 - Atualizar
4 - Deletar
0 - Sair
Escolha: 1
Nome: João Silva
Email: joao@email.com
Senha: 1234
✅ Usuário cadastrado!

