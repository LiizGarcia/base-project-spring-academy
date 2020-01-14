package com.puntosingular.base.services;

import java.util.List;

import com.puntosingular.base.dto.UserDTO;
import com.puntosingular.base.models.Users;

public interface UserService {
	public List <UserDTO> getUsers();
	public UserDTO getUsersByName(String Name);
	public UserDTO findByName(String name);
	

}

