package com.grassrootsmap.backend.services;

import java.util.List;

public interface GeolocationPointService {
    List<GeolocationPointResponseDTO> getUsersLocationPoints(double minLng,double minLat, double maxLng, double maxLat);
}
