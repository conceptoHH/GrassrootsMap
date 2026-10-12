package com.grassrootsmap.backend.DTOs;

import com.grassrootsmap.backend.models.Users;
import org.locationtech.jts.geom.Point;

import java.util.UUID;

public class GeolocationPointResponseDTO {
    private UUID id;
    private Point exact_location;
    private Point public_location;
    private Users users;

    public GeolocationPointResponseDTO(){}

    public GeolocationPointResponseDTO(UUID id, Point exact_location, Point public_location, Users users) {
        this.id = id;
        this.exact_location = exact_location;
        this.public_location = public_location;
        this.users = users;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Point getExact_location() {
        return exact_location;
    }

    public void setExact_location(Point exact_location) {
        this.exact_location = exact_location;
    }

    public Point getPublic_location() {
        return public_location;
    }

    public void setPublic_location(Point public_location) {
        this.public_location = public_location;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
