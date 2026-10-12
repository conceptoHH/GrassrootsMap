package com.grassrootsmap.backend.services.impl;

import com.grassrootsmap.backend.DTOs.GeolocationPointResponseDTO;
import com.grassrootsmap.backend.models.GeolocationPoint;
import com.grassrootsmap.backend.repositories.GeolocationPointRepository;
import com.grassrootsmap.backend.services.GeolocationPointService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GeolocationPointServiceImpl implements GeolocationPointService {
    private final GeolocationPointRepository geolocationPointRepository;
    public GeolocationPointServiceImpl(GeolocationPointRepository geolocationPointRepository){
        this.geolocationPointRepository = geolocationPointRepository;
    }
    @Override
    public List<GeolocationPointResponseDTO> getUsersLocationPoints(double minLng, double minLat, double maxLng, double maxLat) {
        List<GeolocationPoint> usersPoints = geolocationPointRepository.findVisibleUsersInBoundingBox(minLng,minLat, maxLng, maxLat);

        return usersPoints.stream().map(this::mapToGeolocationPointDTO).collect(Collectors.toList());
    }

    private GeolocationPointResponseDTO mapToGeolocationPointDTO(GeolocationPoint gp) {
        GeolocationPointResponseDTO dto = new GeolocationPointResponseDTO();
        dto.setId(gp.getId());
        dto.setExact_location(gp.getExact_location());
        dto.setPublic_location(gp.getPublic_location());
        dto.setUsers(gp.getUser_id());
        return dto;
    }
}
