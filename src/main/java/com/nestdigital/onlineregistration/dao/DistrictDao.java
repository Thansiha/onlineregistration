package com.nestdigital.onlineregistration.dao;

import com.nestdigital.onlineregistration.model.DistrictModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DistrictDao extends CrudRepository<DistrictModel,Integer> {
    @Query(value = "SELECT `id`, `district`, `state_id` FROM `district` WHERE state_id=?1",nativeQuery = true)
    List<DistrictModel> getdistrict(int id);
}
