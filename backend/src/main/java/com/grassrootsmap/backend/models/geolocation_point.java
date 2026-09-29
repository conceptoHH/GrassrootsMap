package com.grassrootsmap.backend.models;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "geolocation_point")
public class geolocation_point {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Point exact_location;
    private Point public_location;
    private Boolean visibility;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user_id;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public geolocation_point() {}

    public geolocation_point(UUID id, Point exact_location, Point public_location, Boolean visibility, User user_id, LocalDateTime created_at, LocalDateTime updated_at) {
        this.id = id;
        this.exact_location = exact_location;
        this.public_location = public_location;
        this.visibility = visibility;
        this.user_id = user_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public Boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
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
