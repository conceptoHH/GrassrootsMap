package com.grassrootsmap.backend.DTOs;

public class SocialsResponseDTO {
    private String username_socials;
    private String link_socials;

    public SocialsResponseDTO() {
    }

    public SocialsResponseDTO(String username_socials, String link_socials) {
        this.username_socials = username_socials;
        this.link_socials = link_socials;
    }

    public String getUsername_socials() {
        return username_socials;
    }

    public void setUsername_socials(String username_socials) {
        this.username_socials = username_socials;
    }

    public String getLink_socials() {
        return link_socials;
    }

    public void setLink_socials(String link_socials) {
        this.link_socials = link_socials;
    }
}
