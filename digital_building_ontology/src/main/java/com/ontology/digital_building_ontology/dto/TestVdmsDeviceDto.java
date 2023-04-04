package com.ontology.digital_building_ontology.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ontology.digital_building_ontology.entity.Connection;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestVdmsDeviceDto {
    private String deviceId;
    private String deviceName;
    private String deviceType;
    private String entityId;

    @JsonIgnoreProperties(value = {"sourceId"})
    private List<Connection> connectionSource;
}
