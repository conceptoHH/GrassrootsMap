package com.grassrootsmap.backend.DTOs;

import com.grassrootsmap.backend.enums.UserRoleEnum;
import com.grassrootsmap.backend.enums.UserStatusEnum;


import java.time.LocalDateTime;

public class UserRequestDTO {
    private String username;
    private String email;
    private String password;
    private UserRoleEnum role;
    private UserStatusEnum status;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public UserRequestDTO(){}

    public UserRequestDTO(
                 String username,
                 String email,
                 String password,
                 UserRoleEnum role,
                 UserStatusEnum status,
                 LocalDateTime created_at,
                 LocalDateTime updated_at) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRoleEnum getRole() {
        return role;
    }

    public void setRole(UserRoleEnum role) {
        this.role = role;
    }

    public UserStatusEnum getStatus() {
        return status;
    }

    public void setStatus(UserStatusEnum status) {
        this.status = status;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}

