package com.tradlyf.tradlyf.serviceimpl;

import com.tradlyf.tradlyf.dbutil.DBUtil;
import com.tradlyf.tradlyf.model.users;
import com.tradlyf.tradlyf.service.UserService;
import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Service
public class UserServiceImpl implements UserService {
    int flag=0;
    users user = new users();
    Connection connction;
    public UserServiceImpl(){
        connction = DBUtil.getConnection();
    }
    @Override
    public users loginValidation(String email, String password) {
        try {
                PreparedStatement statement = connction.prepareStatement("select * from user where mail='"+email+"'");
                ResultSet rs=statement.executeQuery();
                while (rs.next()){
                    if(rs.getString("mail").equals(email) && rs.getString("password").equals(password)){
                        user.setResult(1);

                    }else{
                        System.out.println("invalid credentials");
                        user.setResult(0);
                    }
                }
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

}
