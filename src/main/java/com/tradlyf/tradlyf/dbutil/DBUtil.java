package com.tradlyf.tradlyf.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    private static Connection connection=null;
    public static Connection getConnection(){
        if(connection!=null){
            return connection;
        }
        else
        {
            String driver="com.mysql.cj.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/tradlyf";
            String username="root";
            String password="Zaloni@123";
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
