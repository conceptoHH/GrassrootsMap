package com.grassrootsmap.backend.DTOs;

import com.grassrootsmap.backend.enums.UserRoleEnum;
import com.grassrootsmap.backend.enums.UserStatusEnum;
import com.grassrootsmap.backend.models.DanceStyle;
import com.grassrootsmap.backend.models.GeolocationPoint;
import com.grassrootsmap.backend.models.Socials;
import org.locationtech.jts.geom.Point;


import java.time.LocalDateTime;
import java.util.List;

public class UserRequestDTO {
    private String username;
    private String email;
    private String password;
    private List<Long> dance_styles;
    private String username_social;
    private String link_social;
    private Point public_location;
    private Point exact_location;

    public UserRequestDTO(){}

    public UserRequestDTO(String username, String email, String password, List<Long> dance_styles, String username_social, String link_social, Point public_location, Point exact_location) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.dance_styles = dance_styles;
        this.username_social = username_social;
        this.link_social = link_social;
        this.public_location = public_location;
        this.exact_location = exact_location;
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

    public List<Long> getDance_styles() {
        return dance_styles;
    }

    public void setDance_styles(List<Long> dance_styles) {
        this.dance_styles = dance_styles;
    }

    public String getUsername_social() {
        return username_social;
    }

    public void setUsername_social(String username_social) {
        this.username_social = username_social;
    }

    public String getLink_social() {
        return link_social;
    }

    public void setLink_social(String link_social) {
        this.link_social = link_social;
    }

    public Point getPublic_location() {
        return public_location;
    }

    public void setPublic_location(Point public_location) {
        this.public_location = public_location;
    }

    public Point getExact_location() {
        return exact_location;
    }

    public void setExact_location(Point exact_location) {
        this.exact_location = exact_location;
    }
}

