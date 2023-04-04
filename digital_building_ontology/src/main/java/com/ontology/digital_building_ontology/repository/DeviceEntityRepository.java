package com.ontology.digital_building_ontology.repository;

import com.ontology.digital_building_ontology.entity.DeviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceEntityRepository extends JpaRepository<DeviceEntity, String> {
}
