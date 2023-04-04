package com.ontology.digital_building_ontology.service.serviceImpl;


import com.ontology.digital_building_ontology.dto.ConnectionDto;
import com.ontology.digital_building_ontology.entity.Connection;
import com.ontology.digital_building_ontology.mapper.ConnectionMapper;
import com.ontology.digital_building_ontology.repository.ConnectionRepository;
import com.ontology.digital_building_ontology.service.ConnectionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ConnectionServiceImpl implements ConnectionService {
    private final ConnectionRepository connectionRepository;
    private final ConnectionMapper mapper;
    @Override
    public List<ConnectionDto> getAllOrderItem() {
        List<Connection> connections = connectionRepository.findAll();
        return mapper.connectionDtoToConnection(connections);
    }

    @Override
    public Connection saveOrderItem(Connection connection) {
        return connectionRepository.save(connection);
    }
}
