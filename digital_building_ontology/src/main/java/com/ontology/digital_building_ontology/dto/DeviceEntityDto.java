package com.ontology.digital_building_ontology.dto;

import com.ontology.digital_building_ontology.entity.Connection;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DeviceEntityDto {
    private String id;
    private List<Connection> connectionSource;
    private String connectionType;
    private String displayName;
    private String description;
}
