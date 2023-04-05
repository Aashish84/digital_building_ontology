package com.ontology.digital_building_ontology.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Connection {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String connectionId;
    private String resourceType;
    private String connectionType;
    @Column(name = "source_id")
    private String sourceId;
    @ManyToOne
    @JoinColumn(name = "target_id")
    private DeviceEntity targetId;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private LocationEntity location;


}
