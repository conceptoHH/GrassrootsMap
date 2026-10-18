package com.grassrootsmap.backend.services.impl;

import com.grassrootsmap.backend.DTOs.UserResponseDTO;
import com.grassrootsmap.backend.models.Users;
import com.grassrootsmap.backend.repositories.UsersRepository;
import com.grassrootsmap.backend.services.UsersService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {
    UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @Override
    public UserResponseDTO getSpecificUserByUsername(String username) throws Exception {
        Optional<Users> resp = usersRepository.findByUsername(username);
        if (resp.isEmpty()) {
            throw new Exception("User not found with username: "+ username);
        }
        return mapToUserResponseDTO(resp.get());
    }


    @Override
    public UserResponseDTO getSpecificUserByEmail(String email) throws Exception {
        Optional<Users> resp = usersRepository.findByEmail(email);
        if (resp.isEmpty()) {
            throw new Exception("User not found with email: " + email);
        }
        return mapToUserResponseDTO(resp.get());
    }

    private UserResponseDTO mapToUserResponseDTO(Users users) {

    }
}
