package com.grassrootsmap.backend.repositories;

import com.grassrootsmap.backend.DTOs.UserResponseDTO;
import com.grassrootsmap.backend.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface UsersRepository extends JpaRepository<Users, UUID> {
    @Query(value = "SELECT * FROM get_user_profile(:username)", nativeQuery = true)
    Optional<UserResponseDTO> getUserProfile(String username);
}
