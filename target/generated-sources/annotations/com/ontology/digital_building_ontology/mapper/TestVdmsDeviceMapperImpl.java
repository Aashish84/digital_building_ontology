package com.ontology.digital_building_ontology.mapper;

import com.ontology.digital_building_ontology.dto.TestVdmsDeviceDto;
import com.ontology.digital_building_ontology.entity.Connection;
import com.ontology.digital_building_ontology.entity.TestVdmsDevice;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-04T11:25:14+0545",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Private Build)"
)
@Component
public class TestVdmsDeviceMapperImpl implements TestVdmsDeviceMapper {

    @Override
    public TestVdmsDeviceDto deviceToDeviceDto(TestVdmsDevice device) {
        if ( device == null ) {
            return null;
        }

        TestVdmsDeviceDto testVdmsDeviceDto = new TestVdmsDeviceDto();

        testVdmsDeviceDto.setDeviceId( device.getDeviceId() );
        testVdmsDeviceDto.setDeviceName( device.getDeviceName() );
        testVdmsDeviceDto.setDeviceType( device.getDeviceType() );
        testVdmsDeviceDto.setEntityId( device.getEntityId() );
        List<Connection> list = device.getConnectionSource();
        if ( list != null ) {
            testVdmsDeviceDto.setConnectionSource( new ArrayList<Connection>( list ) );
        }

        return testVdmsDeviceDto;
    }

    @Override
    public List<TestVdmsDeviceDto> deviceToDeviceDto(List<TestVdmsDevice> testVdmsDevices) {
        if ( testVdmsDevices == null ) {
            return null;
        }

        List<TestVdmsDeviceDto> list = new ArrayList<TestVdmsDeviceDto>( testVdmsDevices.size() );
        for ( TestVdmsDevice testVdmsDevice : testVdmsDevices ) {
            list.add( deviceToDeviceDto( testVdmsDevice ) );
        }

        return list;
    }
}
