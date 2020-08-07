package com.desantnic.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        DBWorker dbWorker = new DBWorker();

        String query = "select * from users";
        try {
            Statement statement = dbWorker.getConnection()
                                          .createStatement();
            //ResultSet - это модель ответа нашего запроса
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                User user = new User();
//                user.setId(resultSet.getInt(1));
//                user.setUsername(resultSet.getString(2));
//                user.setPassword(resultSet.getString(3));
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
               // int id = resultSet.getInt(1);
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
