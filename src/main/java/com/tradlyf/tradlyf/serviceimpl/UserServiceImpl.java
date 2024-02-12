package com.tradlyf.serviceimpl;

import com.tradlyf.dbutil.DBUtil;
import com.tradlyf.service.UserService;
import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Service
public class UserServiceImpl implements UserService {
    int flag=0;
    Connection connction;
    public UserServiceImpl(){
        connction = DBUtil.getConnection();
    }
    @Override
    public int loginValidation(String email, String password) {
        try {
                PreparedStatement statement = connction.prepareStatement("select * from user where email='"+email+"'");
                ResultSet rs=statement.executeQuery();
                while (rs.next()){
                    if(rs.getString("email").equals(email) && rs.getString("password").equals(password)){
                        flag=1;
                    }else{
                        System.out.println("invalid credentials");
                    }
                }
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

}
