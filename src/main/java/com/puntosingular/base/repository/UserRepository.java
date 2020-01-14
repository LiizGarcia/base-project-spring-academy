package com.puntosingular.base.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.puntosingular.base.dto.UserDTO;
import com.puntosingular.base.models.Users;
@Repository
public interface UserRepository extends CrudRepository<Users, Long>{
	public Users findByName(String name);
	@Query("Select user from User user where user.name=?1")
	public Users getUserByName(String name);//query cruda
	

}