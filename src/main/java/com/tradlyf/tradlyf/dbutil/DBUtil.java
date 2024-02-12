package com.tradlyf.dbutil;

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
            String driver="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/tradlyf";
            String username="root";
            String password="pchangeme";
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
