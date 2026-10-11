package com.grassrootsmap.backend.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Socials")
public class Socials {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String platform;
    @Column(unique = true, nullable = false)
    private String social_uname;
    @Column(nullable = false)
    private String link;
    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;
    @OneToOne
    @JoinColumn(name = "users_id")
    private Users user;

    public Socials() {}

    public Socials(UUID id, String platform, String social_uname, String link, LocalDateTime created_at, LocalDateTime updated_at, Users users_id) {
        this.id = id;
        this.platform = platform;
        this.social_uname = social_uname;
        this.link = link;
        this.created_at = created_at;
        this.updated_at =  updated_at;
        this.user = users_id;
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

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public Users getUser_id() {
        return user;
    }

    public void setUser_id(Users users_id) {
        this.user = users_id;
    }
}