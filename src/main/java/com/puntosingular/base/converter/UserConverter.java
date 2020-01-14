package com.puntosingular.base.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.puntosingular.base.dto.UserDTO;
import com.puntosingular.base.models.Users;
@Component("UserConverter")
public class UserConverter {
	public UserDTO UserDTOtoUser(Users user) {
		if(user!=null) {
		UserDTO userDTO= new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setLastname(user.getLastname());
		userDTO.setName(user.getName());
		userDTO.setStatus(user.getStatus());
		userDTO.setRoles(user.getRoles());
		return userDTO;

		}
		return null;
	}
	
	public Users UserDTOtoUser(UserDTO userDTO) {
		if(userDTO!=null) {
			Users user= new Users();
			user.setId(userDTO.getId());
			user.setLastname(userDTO.getLastname());
			user.setName(userDTO.getName());
			user.setStatus(userDTO.getStatus());
			user.setRoles(userDTO.getRoles());
			return user;
		}
		
		return null;
	}
	
	public List<UserDTO> UsersDTOtoUsers(Iterable<Users> iterable) {
		List<UserDTO> usersDTO= new ArrayList<UserDTO>();
		for(Users user:iterable) {
			UserDTO userDTO= new UserDTO();
			userDTO.setId(user.getId());
			userDTO.setLastname(user.getLastname());
			userDTO.setName(user.getName());
			userDTO.setStatus(user.getStatus());
			userDTO.setRoles(user.getRoles());
			usersDTO.add(userDTO);
		}
		
		return usersDTO;
	}
	
	

}
