package com.mycompany.userapp;

public class App {
    public static void main(String[] args) {

        UsuarioDAO dao = new UsuarioDAO();
        dao.salvar("Takeshi", "takeshi@email.com");

    }
}