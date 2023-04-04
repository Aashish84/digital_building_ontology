package com.ontology.digital_building_ontology.service;

import com.ontology.digital_building_ontology.dto.ConnectionDto;
import com.ontology.digital_building_ontology.entity.Connection;

import java.util.List;

public interface ConnectionService {
    List<ConnectionDto> getAllOrderItem();
    Connection saveOrderItem(Connection connection);
}
