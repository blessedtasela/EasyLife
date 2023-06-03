/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// import utilities and package
package easylife.EasyLifeUI;

import java.sql.*;

/**
 *
 * @author blessedtasela
 */
public class dbConnection {

    static final String DB_URL = "jdbc:mysql://localhost:3306/easylife";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "";

    public static Connection connectDb() {
        Connection connection;
        try {
            // register the driver, not compulsory for new versions of jdk
            Class.forName("com.mysql.cj.jdbc.Driver");
            // open connection
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            return connection;
        } catch (ClassNotFoundException | SQLException exception) {
       
            System.out.println("Error whhile coonecting to database. please try again");
            return null;
        }
    }
}
