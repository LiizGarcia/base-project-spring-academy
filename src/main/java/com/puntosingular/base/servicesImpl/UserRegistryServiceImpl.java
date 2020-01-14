package com.puntosingular.base.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puntosingular.base.models.Users;
import com.puntosingular.base.repository.UserRepository;
import com.puntosingular.base.services.UserRegistryService;
@Service

public class UserRegistryServiceImpl implements UserRegistryService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public String registrar(Users user) {
		Users savedUser=userRepository.save(user);
	    	   if(savedUser!=null) {
	    		   
	    		   
	   	    	return "El Usuario con id: "+savedUser.getId()+" se ha guardado";
	   	    }
	    	   
	    	   
	    	   
	   	    else {
	   			return "Usuario NO guardado";

	   	    }
	    }
	    
			
	}
	


