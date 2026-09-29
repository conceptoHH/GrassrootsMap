package com.grassrootsmap.backend.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Socials")
public class Socials {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String platform;
    private String social_uname;
    private String link;
    private LocalDateTime created_at;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user_id;

    public Socials() {}

    public Socials(UUID id, String platform, String social_uname, String link, LocalDateTime created_at, User user_id) {
        this.id = id;
        this.platform = platform;
        this.social_uname = social_uname;
        this.link = link;
        this.created_at = created_at;
        this.user_id = user_id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getSocial_uname() {
        return social_uname;
    }

    public void setSocial_uname(String social_uname) {
        this.social_uname = social_uname;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }
}