package com.grassrootsmap.backend.repositories;

import com.grassrootsmap.backend.models.Socials;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SocialsRepository extends JpaRepository<Socials, UUID> {

}
