package com.ontology.digital_building_ontology.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationDTO {
    private String id;
    private String area;
    private String name;
    private String position;
    private String floorId;
    private Integer recordCheckListCount;
    private String recordCheckListStatus;
    private Integer zIndex;
    private  String status;

}
