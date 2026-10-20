package com.grassrootsmap.backend.controllers;

import com.grassrootsmap.backend.DTOs.UserRequestDTO;
import com.grassrootsmap.backend.DTOs.UserResponseDTO;
import com.grassrootsmap.backend.services.UsersService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserResponseDTO> getSpecificUserByUsername(@PathVariable String username) throws Exception {
        UserResponseDTO resp = usersService.getSpecificUserByUsername(username);
        return ResponseEntity.ok(resp);
    }

    @PostMapping
    public HttpStatusCode createUser(@RequestBody UserRequestDTO requestDTO) {
        return HttpStatusCode.valueOf(usersService.CreateUser(requestDTO).value());
    }
}
