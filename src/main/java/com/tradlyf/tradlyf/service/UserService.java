package com.tradlyf.service;

import org.springframework.stereotype.Repository;

@Repository
public interface UserService {

    public int loginValidation(String email, String password);

}
