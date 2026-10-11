package com.grassrootsmap.backend.repositories;

import com.grassrootsmap.backend.models.GeolocationPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface GeolocationPointRepository extends JpaRepository<GeolocationPoint, UUID> {
    @Query(value = "SELECT * " +
    "FROM geolocation_point " +
    "WHERE visibility = true AND " +
    "ST_Contains(ST_MakeEnvelope(:minLng, :minLat, :maxLng, :maxLat, 4326), public_location)", nativeQuery = true)
    List<GeolocationPoint> findVisibleUsersInBoundingBox(
            @Param("minLng") double minLng,
            @Param("minLat") double minLat,
            @Param("maxLng") double maxLng,
            @Param("maxLat") double maxLat
    );
}
