package com.nestdigital.onlineregistration.dao;

import com.nestdigital.onlineregistration.model.CustomerRegistrationModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRegistrationDao extends CrudRepository<CustomerRegistrationModel,Integer> {


}

