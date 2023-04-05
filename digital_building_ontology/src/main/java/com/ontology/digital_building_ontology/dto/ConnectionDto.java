package com.ontology.digital_building_ontology.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConnectionDto {
    private String connectionId;
    private String resourceType;
    private String connectionType;
    private String sourceId;
    private DeviceEntityDto targetDevice;
}
