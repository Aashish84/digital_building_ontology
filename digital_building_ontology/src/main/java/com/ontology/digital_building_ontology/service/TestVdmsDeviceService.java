package com.ontology.digital_building_ontology.service;

import com.ontology.digital_building_ontology.dto.TestVdmsDeviceDto;
import com.ontology.digital_building_ontology.entity.TestVdmsDevice;

import java.util.List;

public interface TestVdmsDeviceService {
    List<TestVdmsDeviceDto> getAllCustomer();

     TestVdmsDevice saveCustomer(TestVdmsDevice testVdmsDeviceService);
}
