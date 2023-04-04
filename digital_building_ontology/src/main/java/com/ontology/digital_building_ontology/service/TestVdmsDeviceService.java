package com.ontology.digital_building_ontology.service;

import com.ontology.digital_building_ontology.entity.TestVdmsDevice;

import java.util.List;

public interface TestVdmsDeviceService {
    List<TestVdmsDevice> getAllCustomer();
    TestVdmsDevice saveCustomer(TestVdmsDevice testVdmsDeviceService);
}
