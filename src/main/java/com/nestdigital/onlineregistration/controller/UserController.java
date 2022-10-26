package com.nestdigital.onlineregistration.controller;

import com.nestdigital.onlineregistration.dao.UserDao;
import com.nestdigital.onlineregistration.model.CustomerRegistrationModel;
import com.nestdigital.onlineregistration.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping("/adduserdatas")
    public String adduser(@RequestBody UserModel addobj){
        dao.save(addobj);
        return "user data added";
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/userlogin")
    public Map login(@RequestBody UserModel loginobj) {
        HashMap<String, String> map = new HashMap<>();
        if (dao.login(loginobj.getEmail(), loginobj.getPassword()).size() > 0) {
            List<UserModel> obj = dao.login(loginobj.getEmail(), loginobj.getPassword());
            map.put("status", "success");
            return map;
        } else {
            map.put("status", "failed");
            return map;
        }
    }
}
