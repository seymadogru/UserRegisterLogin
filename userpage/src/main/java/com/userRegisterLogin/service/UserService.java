package com.userRegisterLogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.userRegisterLogin.web.dto.UserRegistrationDto;
import com.userRegisterLogin.model.User;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
}
