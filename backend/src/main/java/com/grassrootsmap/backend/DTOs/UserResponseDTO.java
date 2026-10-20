package com.grassrootsmap.backend.DTOs;

import com.grassrootsmap.backend.enums.UserRoleEnum;
import com.grassrootsmap.backend.enums.UserStatusEnum;
import com.grassrootsmap.backend.models.DanceStyle;
import com.grassrootsmap.backend.models.Socials;

import java.time.LocalDateTime;
import java.util.List;

public class UserResponseDTO {
    private String username;
    private String email;
    private List<DanceStyleResponseDTO> dance_styles;
    private SocialsResponseDTO socials;
    private LocalDateTime created_at;

    UserResponseDTO() {}

    public UserResponseDTO(String username, String email, List<DanceStyleResponseDTO> dance_styles, SocialsResponseDTO socials, LocalDateTime created_at) {
        this.username = username;
        this.email = email;
        this.dance_styles = dance_styles;
        this.socials = socials;
        this.created_at = created_at;
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

    public List<DanceStyleResponseDTO> getDance_styles() {
        return dance_styles;
    }

    public void setDance_styles(List<DanceStyleResponseDTO> dance_styles) {
        this.dance_styles = dance_styles;
    }

    public SocialsResponseDTO getSocials() {
        return socials;
    }

    public void setSocials(SocialsResponseDTO socials) {
        this.socials = socials;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
