package com.ontology.digital_building_ontology.service.serviceImpl;

import com.ontology.digital_building_ontology.entity.TestVdmsDevice;
import com.ontology.digital_building_ontology.repository.TestVdmsDeviceRepository;
import com.ontology.digital_building_ontology.service.TestVdmsDeviceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TestVdmsDeviceImpl implements TestVdmsDeviceService {
    private final TestVdmsDeviceRepository repository;
    @Override
    public List<TestVdmsDevice> getAllCustomer() {
        return repository.findAll();
    }

    @Override
    public TestVdmsDevice saveCustomer(TestVdmsDevice testVdmsDevice) {
        return repository.save(testVdmsDevice);
    }
}
