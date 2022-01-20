package com.example.restfulAPI.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.restfulAPI.model.Member;

@Repository
public interface MemberDao extends CrudRepository<Member, Integer>{


	@Query( value="select m from Member m where m.email = :email" )
	Member findByEmail(String email);

}
