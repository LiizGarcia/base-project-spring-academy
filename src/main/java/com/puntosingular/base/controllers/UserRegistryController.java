package com.puntosingular.base.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puntosingular.base.models.Users;
import com.puntosingular.base.repository.UserRepository;
import com.puntosingular.base.services.UserRegistryService;
import com.puntosingular.base.services.UserService;
import com.puntosingular.base.servicesImpl.UserRegistryServiceImpl;

@RestController
@RequestMapping("/userR")


public class UserRegistryController {
	@Autowired
   UserRegistryService userService;
	
  @PostMapping("/guardar")
  public String guardarUsuario(@RequestBody Users user) {
	  return userService.registrar(user);
	
}
}
