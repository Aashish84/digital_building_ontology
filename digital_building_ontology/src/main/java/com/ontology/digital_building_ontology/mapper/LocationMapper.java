package com.ontology.digital_building_ontology.mapper;


import com.ontology.digital_building_ontology.dto.LocationDTO;
import com.ontology.digital_building_ontology.entity.LocationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocationMapper {


    LocationDTO locationDTO(LocationEntity locationEntity);
    List<LocationDTO> locationDTOList(List<LocationEntity> locationMapperList);

}
