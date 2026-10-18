package com.grassrootsmap.backend.services;

import com.grassrootsmap.backend.DTOs.UserResponseDTO;
import com.grassrootsmap.backend.services.impl.UsersServiceImpl;

public interface UsersService {
    UserResponseDTO getSpecificUserByUsername(String username) throws Exception;
    UserResponseDTO getSpecificUserByEmail(String email) throws Exception;
}
