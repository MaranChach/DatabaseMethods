package com.company;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        /*Scanner scanner = new Scanner(System.in);

        String URL = ConnectionDB.GetConnectionString();
        //String URL = "jdbc:postgresql://46.229.214.241:5432/TrantinDB";
        System.out.println("Enter login");
        String username = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();

        try{
            Connection connection = DriverManager.getConnection(URL, username, password);
            System.out.println("Connected");
            connection.close();
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("Connection error");
        }*/

        ConnectionDB connectionDB = new ConnectionDB();


        /*ResultSet resultSet = connectionDB.selectQuery("select * from public.test") ;
        String a = resultSet.toString();

        while (resultSet.next()){
            System.out.println(resultSet.getInt(0));
        }*/

        ArrayList list = connectionDB.selectQueryArr("select * from public.test");

        for(Object pos : list){
            System.out.println(pos);
        }
    }
}
