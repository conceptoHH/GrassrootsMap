package com.grassrootsmap.backend.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "UserDanceStyle")
public class UserDanceStyle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "dance_style_id")
    private DanceStyle danceStyle;

    public UserDanceStyle() {
    }

    public UserDanceStyle( Users user, DanceStyle danceStyle) {
        this.user = user;
        this.danceStyle = danceStyle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUser_id() {
        return user.getId();
    }

    public void setUser_id(Users users_id) {
        this.user = users_id;
    }

    public Long getDanceStyle() {
        return danceStyle.getId();
    }

    public void setDanceStyle(DanceStyle danceStyle) {
        this.danceStyle = danceStyle;
    }
}
