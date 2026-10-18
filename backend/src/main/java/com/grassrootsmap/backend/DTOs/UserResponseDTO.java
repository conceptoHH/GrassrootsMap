package com.grassrootsmap.backend.DTOs;

import com.grassrootsmap.backend.enums.UserRoleEnum;
import com.grassrootsmap.backend.enums.UserStatusEnum;

import java.time.LocalDateTime;

public class UserResponseDTO {
    private String username;
    private String email;
    private String password;
    private LocalDateTime created_at;
}
