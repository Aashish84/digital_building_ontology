package com.ontology.digital_building_ontology.repository;

import com.ontology.digital_building_ontology.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<LocationEntity,String> {
}
