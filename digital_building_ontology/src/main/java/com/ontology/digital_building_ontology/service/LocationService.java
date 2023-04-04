package com.ontology.digital_building_ontology.service;

import com.ontology.digital_building_ontology.dto.LocationDTO;
import com.ontology.digital_building_ontology.entity.LocationEntity;

import java.util.List;

public interface LocationService {
    LocationDTO saveLocation(LocationEntity locationEntity);
    List<LocationDTO> getAllLocation();
}
