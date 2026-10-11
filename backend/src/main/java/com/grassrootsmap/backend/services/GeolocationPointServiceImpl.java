package com.grassrootsmap.backend.services;

import com.grassrootsmap.backend.models.GeolocationPoint;
import com.grassrootsmap.backend.repositories.GeolocationPointRepository;

import java.util.List;

public class GeolocationPointServiceImpl implements GeolocationPointService{
    private final GeolocationPointRepository geolocationPointRepository;
    public GeolocationPointServiceImpl(GeolocationPointRepository geolocationPointRepository){
        this.geolocationPointRepository = geolocationPointRepository;
    }
    @Override
    public List<GeolocationPointResponseDTO> getUsersLocationPoints(double minLng,double minLat, double maxLng, double maxLat) {
        List<GeolocationPoint> usersPoints = geolocationPointRepository.findVisibleUsersInBoundingBox(minLng,minLat, maxLng, maxLat);

        return ;
    }

    private GeolocationPointResponseDTO mapToGeolocationPointDTO(GeolocationPoint gp) {
        GeolocationPointResponseDTO dto = new GeolocationPointResponseDTO();
        dto.set
    }
}
