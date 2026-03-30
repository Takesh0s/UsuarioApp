# 📌 UsuarioApp

Projeto Java com Maven que realiza a conexão com banco de dados MySQL e salva usuários em uma tabela.

---

## 🚀 Tecnologias utilizadas

* Java 21
* Maven
* MySQL
* JUnit 5

---

## 🗄️ Banco de dados

Você pode criar o banco de duas formas:

### ✔ Opção 1: Executando manualmente

```sql
CREATE DATABASE db_usuario;

USE db_usuario;

CREATE TABLE tab_usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100)
);
```

### ✔ Opção 2: Utilizando o script

Execute o arquivo:

```text
db_usuario.sql
```

---

## ⚙️ Configuração

Arquivo: `src/main/resources/db.properties`

```properties
db.url=jdbc:mysql://localhost:3306/db_usuario
db.user=root
db.password=root
```

📌 Caso seu MySQL utilize outra senha, altere neste arquivo.

---

## ▶️ Execução

Para executar o projeto:

```bash
mvn exec:java
```

A aplicação irá inserir automaticamente um usuário no banco de dados.

---

## 🧪 Testes

Para executar os testes:

```bash
mvn test
```

### ✔ Cenários testados:

* Conexão com sucesso
* Falha na conexão

---

## 📂 Estrutura do projeto

* `Conexao.java` → responsável pela conexão com o banco
* `UsuarioDAO.java` → responsável pela inserção de dados
* `App.java` → classe principal da aplicação
* `ConexaoTest.java` → testes automatizados com JUnit

---

## 📌 Objetivo do projeto

Projeto desenvolvido para demonstrar a integração entre Java e MySQL utilizando Maven e testes automatizados com JUnit.

---

## 📌 Autor

Luiz Phillipe de Souza Santos