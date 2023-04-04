package com.ontology.digital_building_ontology.service.serviceImpl;


import com.ontology.digital_building_ontology.entity.Connection;
import com.ontology.digital_building_ontology.repository.ConnectionRepository;
import com.ontology.digital_building_ontology.service.ConnectionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ConnectionServiceImpl implements ConnectionService {
    private final ConnectionRepository connectionRepository;
    @Override
    public List<Connection> getAllOrderItem() {
        return connectionRepository.findAll();
    }

    @Override
    public Connection saveOrderItem(Connection connection) {
        return connectionRepository.save(connection);
    }
}
