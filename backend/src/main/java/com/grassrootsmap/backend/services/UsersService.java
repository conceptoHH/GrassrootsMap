package com.grassrootsmap.backend.services;

import com.grassrootsmap.backend.DTOs.UserRequestDTO;
import com.grassrootsmap.backend.DTOs.UserResponseDTO;
import org.springframework.http.HttpStatusCode;

public interface UsersService {
    UserResponseDTO getSpecificUserByUsername(String username) throws Exception;
    HttpStatusCode CreateUser(UserRequestDTO request);
}
