package com.grassrootsmap.backend.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "User_Dance_Style")
public class User_Dance_Style {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;

    @ManyToOne
    @JoinColumn(name = "dance_style_id")
    private Dance_Style danceStyle_id;

    public User_Dance_Style() {
    }

    public User_Dance_Style(Long id, User user_id, Dance_Style danceStyle_id) {
        this.id = id;
        this.user_id = user_id;
        this.danceStyle_id = danceStyle_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUser_id() {
        return user_id.getId();
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Long getDanceStyle_id() {
        return danceStyle_id.getId();
    }

    public void setDanceStyle_id(Dance_Style danceStyle_id) {
        this.danceStyle_id = danceStyle_id;
    }
}
