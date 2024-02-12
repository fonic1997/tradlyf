package com.tradlyf.tradlyf.controller;
import com.tradlyf.tradlyf.model.users;
import com.tradlyf.tradlyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    @ResponseBody
    public users UserLogin(@RequestBody users user1){
        users flag=userService.loginValidation(user1.getEmail(), user1.getPassword());
        if (flag.getResult() == 0) {
            return flag;
        }
        return flag;
    }

    @PostMapping("/signup")
    public users Signup(@RequestBody users user){
        this.userService.signup(user);
        return user;
    }

}
