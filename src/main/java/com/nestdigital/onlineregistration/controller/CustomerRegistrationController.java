package com.nestdigital.onlineregistration.controller;

import com.nestdigital.onlineregistration.dao.CustomerRegistrationDao;
import com.nestdigital.onlineregistration.model.CustomerRegistrationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerRegistrationController {
    @Autowired
    CustomerRegistrationDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping("/addcustomer")
    public String addcustomer (@RequestBody CustomerRegistrationModel addobj){
        dao.save(addobj);
        return "customer registration completed";
    }
}
