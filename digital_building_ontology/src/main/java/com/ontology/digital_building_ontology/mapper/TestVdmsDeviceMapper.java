package com.ontology.digital_building_ontology.mapper;

import com.ontology.digital_building_ontology.dto.TestVdmsDeviceDto;
import com.ontology.digital_building_ontology.entity.TestVdmsDevice;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TestVdmsDeviceMapper {

   TestVdmsDeviceDto deviceToDeviceDto (TestVdmsDevice device);
   List<TestVdmsDeviceDto> deviceToDeviceDto(List<TestVdmsDevice> testVdmsDevices);
}
