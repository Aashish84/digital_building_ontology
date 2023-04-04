package com.ontology.digital_building_ontology.service.serviceImpl;

import com.ontology.digital_building_ontology.dto.DeviceEntityDto;
import com.ontology.digital_building_ontology.entity.DeviceEntity;
import com.ontology.digital_building_ontology.mapper.DeviceEntityMapper;
import com.ontology.digital_building_ontology.repository.DeviceEntityRepository;
import com.ontology.digital_building_ontology.service.DeviceEntityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DeviceEntityServiceImpl implements DeviceEntityService {
    private final DeviceEntityRepository deviceEntityRepository;
    private final DeviceEntityMapper deviceEntityMapper;
    @Override
    public List<DeviceEntityDto> getAll() {
        List<DeviceEntity> all = deviceEntityRepository.findAll();
        return deviceEntityMapper.entitiesToDtos(all);
    }

    @Override
    public DeviceEntity save(DeviceEntity deviceEntity) {
        return deviceEntityRepository.save(deviceEntity);
    }
}
