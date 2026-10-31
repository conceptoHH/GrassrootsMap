package com.grassrootsmap.backend.DTOs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.grassrootsmap.backend.enums.UserRoleEnum;
import com.grassrootsmap.backend.enums.UserStatusEnum;
import com.grassrootsmap.backend.models.DanceStyle;
import com.grassrootsmap.backend.models.Socials;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;
import java.util.List;

public class UserResponseDTO {
    private String username;
    private String email;
    @JdbcTypeCode(SqlTypes.JSON)
    private List<DanceStyleResponseDTO> dance_styles;
    @JdbcTypeCode(SqlTypes.JSON)
    private SocialsResponseDTO socials;
    private LocalDateTime created_at;

    UserResponseDTO() {}

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public UserResponseDTO(String username, String email, String danceStyleJson, String socialsJson, LocalDateTime created_at) {
        this.username = username;
        this.email = email;
        this.created_at = created_at;

        try {
            if (danceStyleJson != null) {
                this.dance_styles = objectMapper.readValue(danceStyleJson, new TypeReference<List<DanceStyleResponseDTO>>() {});
            }
            if (socialsJson != null) {
                this.socials = objectMapper.readValue(socialsJson, SocialsResponseDTO.class);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("Failed to deserialize JSON from DATABASE function: ", e);
        }
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
