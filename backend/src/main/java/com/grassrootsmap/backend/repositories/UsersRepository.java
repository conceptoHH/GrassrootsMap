package com.grassrootsmap.backend.repositories;

import com.grassrootsmap.backend.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsersRepository extends JpaRepository<Users, UUID> {

}
