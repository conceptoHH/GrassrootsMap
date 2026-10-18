package com.grassrootsmap.backend.controllers;

import com.grassrootsmap.backend.DTOs.GeolocationPointResponseDTO;
import com.grassrootsmap.backend.services.GeolocationPointService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/geo-points")
public class GeolocationPointController {
    private final GeolocationPointService geolocationPointService;

    public GeolocationPointController(GeolocationPointService geolocationPointService){
        this.geolocationPointService = geolocationPointService;
    }

    @GetMapping
    public ResponseEntity<List<GeolocationPointResponseDTO>> getGeoPointsAllVisibleUsers(
            @RequestParam("minLng") double minLng,
            @RequestParam("minLat") double minLat,
            @RequestParam("maxLng") double maxLng,
            @RequestParam("maxLat") double maxLat
    ){
        List<GeolocationPointResponseDTO> points = geolocationPointService.getUsersLocationPoints(minLng,
                minLat,
                maxLng,
                maxLat);
        return ResponseEntity.ok(points);
    }

}
