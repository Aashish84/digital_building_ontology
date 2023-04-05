package com.ontology.digital_building_ontology.mapper;

import com.ontology.digital_building_ontology.dto.DeviceEntityDto;
import com.ontology.digital_building_ontology.entity.DeviceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring" , uses = {ConnectionMapper.class})
public interface DeviceEntityMapper {
    @Mapping(source = "deviceEntity.connectionSource" , target = "connectionSourceDto")
    DeviceEntityDto entityToDto(DeviceEntity deviceEntity);
    List<DeviceEntityDto> entitiesToDtos (List<DeviceEntity> deviceEntities);
}
