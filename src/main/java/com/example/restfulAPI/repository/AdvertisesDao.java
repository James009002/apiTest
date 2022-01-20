package com.example.restfulAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.restfulAPI.model.Advertise;

@Repository
public interface AdvertisesDao extends CrudRepository<Advertise, Integer> {

}
