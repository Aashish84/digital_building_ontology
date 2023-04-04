package com.ontology.digital_building_ontology.mapper;

import com.ontology.digital_building_ontology.dto.ConnectionDto;
import com.ontology.digital_building_ontology.entity.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-04T10:27:27+0545",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Private Build)"
)
@Component
public class ConnectionMapperImpl implements ConnectionMapper {

    @Override
    public ConnectionDto connectionDtoToConnection(Connection connection) {
        if ( connection == null ) {
            return null;
        }

        ConnectionDto connectionDto = new ConnectionDto();

        return connectionDto;
    }

    @Override
    public List<ConnectionDto> connectionDtoToConnection(List<Connection> connections) {
        if ( connections == null ) {
            return null;
        }

        List<ConnectionDto> list = new ArrayList<ConnectionDto>( connections.size() );
        for ( Connection connection : connections ) {
            list.add( connectionDtoToConnection( connection ) );
        }

        return list;
    }
}
