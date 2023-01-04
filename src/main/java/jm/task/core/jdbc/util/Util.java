package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
//        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            System.out.println("Connection ok");
//            return connection;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Connection ERROR");
//            return null;
//        }
//    }
Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("OK");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERRRoo");
        }
        return connection;
    }
}