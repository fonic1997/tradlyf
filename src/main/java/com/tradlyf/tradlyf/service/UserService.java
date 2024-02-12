package com.tradlyf.tradlyf.service;

import com.tradlyf.tradlyf.model.users;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {

    public users loginValidation(String email, String password);

}
