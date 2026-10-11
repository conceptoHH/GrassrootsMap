package com.grassrootsmap.backend.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "GeolocationPoint")
public class GeolocationPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(columnDefinition = "geometry(Point,4326)")
    private Point exact_location;
    @Column(columnDefinition = "geometry(Point,4326)")
    private Point public_location;
    private Boolean visibility;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;
    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;

    public GeolocationPoint() {}

    public GeolocationPoint(UUID id, Point exact_location, Point public_location, Boolean visibility, Users user, LocalDateTime created_at, LocalDateTime updated_at) {
        this.id = id;
        this.exact_location = exact_location;
        this.public_location = public_location;
        this.visibility = visibility;
        this.user = user;
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

    public Users getUser_id() {
        return user;
    }

    public void setUser_id(Users users_id) {
        this.user = users_id;
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
