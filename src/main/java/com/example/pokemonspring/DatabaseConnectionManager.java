package com.example.pokemonspring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private static String hostname;
    private static String username;
    private static String password;
    private static Connection conn;

    public static Connection getConnection(){
        if(conn != null){
            return conn;
        }

        hostname = "jdbc:mysql://pokemoncards22.mysql.database.azure.com";
        username = "pokemon";
        password = "Basma123";
        try {
            System.out.println("Connected");
            conn = DriverManager.getConnection(hostname, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}


