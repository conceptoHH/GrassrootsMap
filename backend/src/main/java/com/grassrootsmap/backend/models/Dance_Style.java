package com.grassrootsmap.backend.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Dance_Style")
public class Dance_Style {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String style_name;
    private LocalDate created_at;
    private LocalDate updated_at;

    public Dance_Style(){}

    public Dance_Style(Long id, String style_name, LocalDate created_at, LocalDate updated_at) {
        this.id = id;
        this.style_name = style_name;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStyle_name() {
        return style_name;
    }

    public void setStyle_name(String style_name) {
        this.style_name = style_name;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public LocalDate getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }

}
