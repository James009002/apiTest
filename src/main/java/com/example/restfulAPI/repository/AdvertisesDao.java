package com.example.restfulAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.restfulAPI.model.Advertises;

@Repository
public interface AdvertisesDao extends CrudRepository<Advertises, Integer> {

}
