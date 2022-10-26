package com.nestdigital.onlineregistration.dao;

import com.nestdigital.onlineregistration.model.CustomerRegistrationModel;
import com.nestdigital.onlineregistration.model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<UserModel,Integer> {
    @Query(value = "SELECT `id`, `dob`, `email`, `firstname`, `gender`, `lastname`, `mobilenum`, `password` FROM `usertable` WHERE `email`=?1 AND`password`=?2",nativeQuery = true)
    List<UserModel> login(String emailid, String password);
}
