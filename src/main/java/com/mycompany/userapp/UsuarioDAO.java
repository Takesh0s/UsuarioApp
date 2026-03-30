package com.mycompany.userapp;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    public void salvar(String nome, String email) {
        String sql = "INSERT INTO tab_usuario (nome, email) VALUES (?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.executeUpdate();

            System.out.println("Usuário salvo!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}