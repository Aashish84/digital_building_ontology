package com.ontology.digital_building_ontology.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DeviceEntityDto {
    private String id;
    private List<ConnectionDto> connectionSourceDto;
    private String connectionType;
    private String displayName;
    private String description;
}
