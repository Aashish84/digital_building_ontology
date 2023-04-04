package com.ontology.digital_building_ontology.mapper;

import com.ontology.digital_building_ontology.dto.ConnectionDto;
import com.ontology.digital_building_ontology.entity.Connection;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ConnectionMapper {
    ConnectionDto connectionDtoToConnection (Connection connection);
    List<ConnectionDto> connectionDtoToConnection (List<Connection> connections);
}
