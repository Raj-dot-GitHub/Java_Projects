package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/banksystem";
            String username = "root";
            String password = "mySql@1234";
            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}