package com.ontology.digital_building_ontology.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class TestVdmsDevice {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String deviceId;
    private String deviceName;
    private String deviceType;
    private String entityId;

    @OneToMany
    @JoinColumn(name = "source_id")
    private List<Connection> connectionSource;
}
