package com.nestdigital.onlineregistration.controller;

import com.nestdigital.onlineregistration.dao.StateDao;
import com.nestdigital.onlineregistration.model.StateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StateController {
    @Autowired
    StateDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/displaystates")
    public List<StateModel>viewstate(){
        return (List<StateModel>)dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/state")
    public String state(@RequestBody StateModel obj){
        return dao.state(obj.getState());
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/getstateid")
    public String state(@RequestBody )


}
