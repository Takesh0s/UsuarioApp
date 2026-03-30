package com.mycompany.userapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.InputStream;

public class Conexao {

    public static Connection conectar() throws Exception {

        Properties props = new Properties();
        InputStream input = Conexao.class
                .getClassLoader()
                .getResourceAsStream("db.properties");

        props.load(input);

        String url = props.getProperty("db.url");
        String user = props.getProperty("db.user");
        String password = props.getProperty("db.password");

        return DriverManager.getConnection(url, user, password);
    }
}