package com.ontology.digital_building_ontology.service.serviceImpl;

import com.ontology.digital_building_ontology.dto.LocationDTO;
import com.ontology.digital_building_ontology.entity.LocationEntity;
import com.ontology.digital_building_ontology.mapper.LocationMapper;
import com.ontology.digital_building_ontology.repository.LocationRepository;
import com.ontology.digital_building_ontology.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;
    private final LocationMapper locationMapper;

    public LocationServiceImpl(LocationRepository locationRepository, LocationMapper locationMapper) {
        this.locationRepository = locationRepository;
        this.locationMapper = locationMapper;
    }

    @Override
    public LocationDTO saveLocation(LocationEntity locationEntity) {
        LocationEntity save= locationRepository.save(locationEntity);
        return locationMapper.locationDTO(save);
    }

    @Override
    public List<LocationDTO> getAllLocation() {
        List<LocationEntity> findAll = locationRepository.findAll();
        return locationMapper.locationDTOList(findAll);
    }
}
