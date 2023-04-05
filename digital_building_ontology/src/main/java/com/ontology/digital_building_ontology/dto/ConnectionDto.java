package com.ontology.digital_building_ontology.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ontology.digital_building_ontology.entity.DeviceEntity;
import com.ontology.digital_building_ontology.entity.LocationEntity;
import com.ontology.digital_building_ontology.entity.TestVdmsDevice;
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
    private DeviceEntity targetId;

    private LocationEntity locationId;


}
