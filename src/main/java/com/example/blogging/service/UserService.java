package com.example.blogging.service;

import com.example.blogging.Controllers.UserRegistrationDto;
import com.example.blogging.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);


   public boolean activateUser(String code);

}
