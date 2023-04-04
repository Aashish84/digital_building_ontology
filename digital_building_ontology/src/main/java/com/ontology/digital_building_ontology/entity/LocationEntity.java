package com.ontology.digital_building_ontology.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class LocationEntity {
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "area")
    private String area;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "position")
    private String position;
    @Basic
    @Column(name = "floor_id")
    private String floorId;
    @Basic
    @Column(name = "record_checklist_count")
    private Integer recordChecklistCount;
    @Basic
    @Column(name = "record_checklist_status")
    private String recordChecklistStatus;
    @Basic
    @Column(name = "z_index")
    private Integer zIndex;
    @Basic
    @Column(name = "status")
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

    public Integer getRecordChecklistCount() {
        return recordChecklistCount;
    }

    public void setRecordChecklistCount(Integer recordChecklistCount) {
        this.recordChecklistCount = recordChecklistCount;
    }

    public String getRecordChecklistStatus() {
        return recordChecklistStatus;
    }

    public void setRecordChecklistStatus(String recordChecklistStatus) {
        this.recordChecklistStatus = recordChecklistStatus;
    }

    public Integer getzIndex() {
        return zIndex;
    }

    public void setzIndex(Integer zIndex) {
        this.zIndex = zIndex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocationEntity that = (LocationEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (floorId != null ? !floorId.equals(that.floorId) : that.floorId != null) return false;
        if (recordChecklistCount != null ? !recordChecklistCount.equals(that.recordChecklistCount) : that.recordChecklistCount != null)
            return false;
        if (recordChecklistStatus != null ? !recordChecklistStatus.equals(that.recordChecklistStatus) : that.recordChecklistStatus != null)
            return false;
        if (zIndex != null ? !zIndex.equals(that.zIndex) : that.zIndex != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (floorId != null ? floorId.hashCode() : 0);
        result = 31 * result + (recordChecklistCount != null ? recordChecklistCount.hashCode() : 0);
        result = 31 * result + (recordChecklistStatus != null ? recordChecklistStatus.hashCode() : 0);
        result = 31 * result + (zIndex != null ? zIndex.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
