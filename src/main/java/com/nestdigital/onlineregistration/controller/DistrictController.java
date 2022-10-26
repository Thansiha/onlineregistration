package com.nestdigital.onlineregistration.controller;

import com.nestdigital.onlineregistration.dao.DistrictDao;
import com.nestdigital.onlineregistration.model.DistrictModel;
import com.nestdigital.onlineregistration.model.StateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DistrictController {
    @Autowired
    DistrictDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/displaydistrict")
    public List<DistrictModel>viewdistrict(){
        return (List<DistrictModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/getdistricts")
    public List<DistrictModel> district(@RequestBody StateModel obj){
        return dao.getdistrict(obj.getId());

    }


}
