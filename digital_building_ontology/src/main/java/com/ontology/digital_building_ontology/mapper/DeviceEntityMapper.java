package com.ontology.digital_building_ontology.mapper;

import com.ontology.digital_building_ontology.dto.DeviceEntityDto;
import com.ontology.digital_building_ontology.entity.DeviceEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeviceEntityMapper {
    DeviceEntityDto entityToDto(DeviceEntity deviceEntity);
    DeviceEntity dtoToEntity(DeviceEntityDto deviceEntityDto);
    List<DeviceEntityDto> entitiesToDtos (List<DeviceEntity> deviceEntities);
}
