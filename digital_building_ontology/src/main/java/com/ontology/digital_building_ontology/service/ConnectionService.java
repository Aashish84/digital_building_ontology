package com.ontology.digital_building_ontology.service;

import com.ontology.digital_building_ontology.entity.Connection;

import java.util.List;

public interface ConnectionService {
    List<Connection> getAllOrderItem();
    Connection saveOrderItem(Connection connection);
}
