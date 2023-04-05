package com.ontology.digital_building_ontology.mapper;

import com.ontology.digital_building_ontology.dto.ConnectionDto;
import com.ontology.digital_building_ontology.entity.Connection;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring" )
public interface ConnectionMapper {
    @Mapping(source = "connection.targetId",target = "targetDevice")
    ConnectionDto connectionDtoToConnection (Connection connection);
    List<ConnectionDto> connectionDtoToConnection (List<Connection> connections);
    @Named("noSourceId")
    @Mapping(target = "sourceId" , ignore = true)
    @Mapping(source = "connection.targetId",target = "targetDevice")
    ConnectionDto entityToDtoFiltered (Connection connection);
}
