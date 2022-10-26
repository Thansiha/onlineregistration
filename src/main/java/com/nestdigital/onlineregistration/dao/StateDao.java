package com.nestdigital.onlineregistration.dao;

import com.nestdigital.onlineregistration.model.StateModel;
import com.nestdigital.onlineregistration.model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StateDao extends CrudRepository<StateModel,Integer> {

    @Query(value = "SELECT `id`FROM `state` WHERE `state`=?1",nativeQuery = true)
    String state(String state);

}
