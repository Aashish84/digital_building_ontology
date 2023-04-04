package com.ontology.digital_building_ontology.controller;

import com.ontology.digital_building_ontology.dto.LocationDTO;
import com.ontology.digital_building_ontology.entity.LocationEntity;
import com.ontology.digital_building_ontology.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {
    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/getLocations")
    public ResponseEntity<?> getLocations(){
        return new ResponseEntity<>(locationService.getAllLocation(), HttpStatus.OK);
    }

    @PostMapping("/saveLocation")
    public ResponseEntity<?> saveLocation(LocationEntity location){
        return new ResponseEntity<>(locationService.saveLocation(location),HttpStatus.CREATED);
    }
}
