package com.grassrootsmap.backend.DTOs;


public class UserResponseGeoDTO {
    private String username;
    private String email;

    UserResponseGeoDTO() {}

    public UserResponseGeoDTO(String username, String email) {
        this.username = username;
        this.email = email;
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
}
