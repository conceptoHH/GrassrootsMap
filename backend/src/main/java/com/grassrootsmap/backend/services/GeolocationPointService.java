package com.grassrootsmap.backend.services;

import com.grassrootsmap.backend.DTOs.GeolocationPointResponseDTO;

import java.util.List;

public interface GeolocationPointService {
    List<GeolocationPointResponseDTO> getUsersLocationPoints(double minLng,
                                                             double minLat,
                                                             double maxLng,
                                                             double maxLat);
}
