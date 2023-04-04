package com.ontology.digital_building_ontology.service;

import com.ontology.digital_building_ontology.dto.DeviceEntityDto;
import com.ontology.digital_building_ontology.entity.DeviceEntity;

import java.util.List;

public interface DeviceEntityService {
    List<DeviceEntityDto> getAll();
    DeviceEntity save(DeviceEntity deviceEntity);
}
