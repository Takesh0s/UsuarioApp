tab_usuarioCREATE DATABASE db_usuario;

USE db_usuario;

CREATE TABLE tab_usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100)
);