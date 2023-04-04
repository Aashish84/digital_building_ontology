package com.ontology.digital_building_ontology.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "device")
public class DeviceEntity {
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Id
    @Column(name = "id")
    private String id;
    @OneToMany
    @JoinColumn(name = "source_id")
    private List<Connection> connectionSource;
    @Basic
    @Column(name = "alarm")
    private Integer alarm;
    @Basic
    @Column(name = "asset_match_status")
    private Integer assetMatchStatus;
    @Basic
    @Column(name = "bacnet_count")
    private Integer bacnetCount;
    @Basic
    @Column(name = "bacnet_status")
    private String bacnetStatus;
    @Basic
    @Column(name = "checklist_template_count")
    private Integer checklistTemplateCount;
    @Basic
    @Column(name = "connection_type")
    private String connectionType;
    @Basic
    @Column(name = "custom_fields")
    private String customFields;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "display_name")
    private String displayName;
    @Basic
    @Column(name = "disruptive_count")
    private Integer disruptiveCount;
    @Basic
    @Column(name = "disruptive_status")
    private String disruptiveStatus;
    @Basic
    @Column(name = "document_count")
    private Integer documentCount;
    @Basic
    @Column(name = "email_alert")
    private Integer emailAlert;
    @Basic
    @Column(name = "interface_count")
    private Integer interfaceCount;
    @Basic
    @Column(name = "ip_address")
    private String ipAddress;
    @Basic
    @Column(name = "knx_count")
    private Integer knxCount;
    @Basic
    @Column(name = "knx_status")
    private String knxStatus;
    @Basic
    @Column(name = "last_seen_on")
    private BigDecimal lastSeenOn;
    @Basic
    @Column(name = "latitude")
    private String latitude;
    @Basic
    @Column(name = "local_vendor_email_alert")
    private Integer localVendorEmailAlert;
    @Basic
    @Column(name = "local_vendor_sms_alert")
    private Integer localVendorSmsAlert;
    @Basic
    @Column(name = "longitude")
    private String longitude;
    @Basic
    @Column(name = "lorawan_count")
    private Integer lorawanCount;
    @Basic
    @Column(name = "lorawan_status")
    private String lorawanStatus;
    @Basic
    @Column(name = "mac_address")
    private String macAddress;
    @Basic
    @Column(name = "matched_product_ids")
    private String matchedProductIds;
    @Basic
    @Column(name = "measuring_instrument_count")
    private Integer measuringInstrumentCount;
    @Basic
    @Column(name = "media_count")
    private Integer mediaCount;
    @Basic
    @Column(name = "model")
    private String model;
    @Basic
    @Column(name = "monitor")
    private Integer monitor;
    @Basic
    @Column(name = "monnit_count")
    private Integer monnitCount;
    @Basic
    @Column(name = "monnit_status")
    private String monnitStatus;
    @Basic
    @Column(name = "my_devices_count")
    private Integer myDevicesCount;
    @Basic
    @Column(name = "my_devices_status")
    private String myDevicesStatus;
    @Basic
    @Column(name = "network_layer")
    private String networkLayer;
    @Basic
    @Column(name = "notes_count")
    private Integer notesCount;
    @Basic
    @Column(name = "parent")
    private String parent;
    @Basic
    @Column(name = "pelican_count")
    private Integer pelicanCount;
    @Basic
    @Column(name = "pelican_status")
    private String pelicanStatus;
    @Basic
    @Column(name = "popup_notification")
    private Integer popupNotification;
    @Basic
    @Column(name = "position")
    private String position;
    @Basic
    @Column(name = "quick_link_name")
    private String quickLinkName;
    @Basic
    @Column(name = "quick_link_url")
    private String quickLinkUrl;
    @Basic
    @Column(name = "remote_access")
    private Integer remoteAccess;
    @Basic
    @Column(name = "serial_number")
    private String serialNumber;
    @Basic
    @Column(name = "sms_alert")
    private Integer smsAlert;
    @Basic
    @Column(name = "snmp_count")
    private Integer snmpCount;
    @Basic
    @Column(name = "snmp_object_count")
    private Integer snmpObjectCount;
    @Basic
    @Column(name = "snmp_object_status")
    private String snmpObjectStatus;
    @Basic
    @Column(name = "snmp_parent")
    private String snmpParent;
    @Basic
    @Column(name = "snmp_parent_index")
    private String snmpParentIndex;
    @Basic
    @Column(name = "snmp_status")
    private String snmpStatus;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "subsystem_count")
    private Integer subsystemCount;
    @Basic
    @Column(name = "subsystem_parent_id")
    private String subsystemParentId;
    @Basic
    @Column(name = "ticket_count")
    private Integer ticketCount;
    @Basic
    @Column(name = "ticket_status")
    private String ticketStatus;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "user_connection_type")
    private String userConnectionType;
    @Basic
    @Column(name = "user_data_model")
    private String userDataModel;
    @Basic
    @Column(name = "user_data_name")
    private String userDataName;
    @Basic
    @Column(name = "user_data_type")
    private String userDataType;
    @Basic
    @Column(name = "user_data_vendor")
    private String userDataVendor;
    @Basic
    @Column(name = "vendor")
    private String vendor;
    @Basic
    @Column(name = "virtual_device_type")
    private Integer virtualDeviceType;
    @Basic
    @Column(name = "warranty")
    private String warranty;
    @Basic
    @Column(name = "docker_name")
    private String dockerName;
    @Basic
    @Column(name = "docker_vdms_id")
    private String dockerVdmsId;
    @Basic
    @Column(name = "global_vendor_id")
    private String globalVendorId;
    @Basic
    @Column(name = "local_vendor_id")
    private String localVendorId;
    @Basic
    @Column(name = "location_id")
    private String locationId;
    @Basic
    @Column(name = "other_vendor_1_id")
    private String otherVendor1Id;
    @Basic
    @Column(name = "other_vendor_2_id")
    private String otherVendor2Id;
    @Basic
    @Column(name = "other_vendor_3_id")
    private String otherVendor3Id;
    @Basic
    @Column(name = "product_id")
    private String productId;
    @Basic
    @Column(name = "measuring_instrument_status")
    private String measuringInstrumentStatus;
    @Basic
    @Column(name = "record_checklist_count")
    private Integer recordChecklistCount;
    @Basic
    @Column(name = "record_checklist_status")
    private String recordChecklistStatus;
    @Basic
    @Column(name = "daintree_count")
    private Integer daintreeCount;
    @Basic
    @Column(name = "daintree_status")
    private String daintreeStatus;
    @Basic
    @Column(name = "qrcode_count")
    private Integer qrcodeCount;
    @Basic
    @Column(name = "asset_image_url")
    private String assetImageUrl;
    @Basic
    @Column(name = "created_timestamp")
    private BigDecimal createdTimestamp;
    @Basic
    @Column(name = "ecobee_count")
    private Integer ecobeeCount;
    @Basic
    @Column(name = "ecobee_status")
    private String ecobeeStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAlarm() {
        return alarm;
    }

    public void setAlarm(Integer alarm) {
        this.alarm = alarm;
    }

    public Integer getAssetMatchStatus() {
        return assetMatchStatus;
    }

    public void setAssetMatchStatus(Integer assetMatchStatus) {
        this.assetMatchStatus = assetMatchStatus;
    }

    public Integer getBacnetCount() {
        return bacnetCount;
    }

    public void setBacnetCount(Integer bacnetCount) {
        this.bacnetCount = bacnetCount;
    }

    public String getBacnetStatus() {
        return bacnetStatus;
    }

    public void setBacnetStatus(String bacnetStatus) {
        this.bacnetStatus = bacnetStatus;
    }

    public Integer getChecklistTemplateCount() {
        return checklistTemplateCount;
    }

    public void setChecklistTemplateCount(Integer checklistTemplateCount) {
        this.checklistTemplateCount = checklistTemplateCount;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getCustomFields() {
        return customFields;
    }

    public void setCustomFields(String customFields) {
        this.customFields = customFields;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getDisruptiveCount() {
        return disruptiveCount;
    }

    public void setDisruptiveCount(Integer disruptiveCount) {
        this.disruptiveCount = disruptiveCount;
    }

    public String getDisruptiveStatus() {
        return disruptiveStatus;
    }

    public void setDisruptiveStatus(String disruptiveStatus) {
        this.disruptiveStatus = disruptiveStatus;
    }

    public Integer getDocumentCount() {
        return documentCount;
    }

    public void setDocumentCount(Integer documentCount) {
        this.documentCount = documentCount;
    }

    public Integer getEmailAlert() {
        return emailAlert;
    }

    public void setEmailAlert(Integer emailAlert) {
        this.emailAlert = emailAlert;
    }

    public Integer getInterfaceCount() {
        return interfaceCount;
    }

    public void setInterfaceCount(Integer interfaceCount) {
        this.interfaceCount = interfaceCount;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getKnxCount() {
        return knxCount;
    }

    public void setKnxCount(Integer knxCount) {
        this.knxCount = knxCount;
    }

    public String getKnxStatus() {
        return knxStatus;
    }

    public void setKnxStatus(String knxStatus) {
        this.knxStatus = knxStatus;
    }

    public BigDecimal getLastSeenOn() {
        return lastSeenOn;
    }

    public void setLastSeenOn(BigDecimal lastSeenOn) {
        this.lastSeenOn = lastSeenOn;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getLocalVendorEmailAlert() {
        return localVendorEmailAlert;
    }

    public void setLocalVendorEmailAlert(Integer localVendorEmailAlert) {
        this.localVendorEmailAlert = localVendorEmailAlert;
    }

    public Integer getLocalVendorSmsAlert() {
        return localVendorSmsAlert;
    }

    public void setLocalVendorSmsAlert(Integer localVendorSmsAlert) {
        this.localVendorSmsAlert = localVendorSmsAlert;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Integer getLorawanCount() {
        return lorawanCount;
    }

    public void setLorawanCount(Integer lorawanCount) {
        this.lorawanCount = lorawanCount;
    }

    public String getLorawanStatus() {
        return lorawanStatus;
    }

    public void setLorawanStatus(String lorawanStatus) {
        this.lorawanStatus = lorawanStatus;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getMatchedProductIds() {
        return matchedProductIds;
    }

    public void setMatchedProductIds(String matchedProductIds) {
        this.matchedProductIds = matchedProductIds;
    }

    public Integer getMeasuringInstrumentCount() {
        return measuringInstrumentCount;
    }

    public void setMeasuringInstrumentCount(Integer measuringInstrumentCount) {
        this.measuringInstrumentCount = measuringInstrumentCount;
    }

    public Integer getMediaCount() {
        return mediaCount;
    }

    public void setMediaCount(Integer mediaCount) {
        this.mediaCount = mediaCount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMonitor() {
        return monitor;
    }

    public void setMonitor(Integer monitor) {
        this.monitor = monitor;
    }

    public Integer getMonnitCount() {
        return monnitCount;
    }

    public void setMonnitCount(Integer monnitCount) {
        this.monnitCount = monnitCount;
    }

    public String getMonnitStatus() {
        return monnitStatus;
    }

    public void setMonnitStatus(String monnitStatus) {
        this.monnitStatus = monnitStatus;
    }

    public Integer getMyDevicesCount() {
        return myDevicesCount;
    }

    public void setMyDevicesCount(Integer myDevicesCount) {
        this.myDevicesCount = myDevicesCount;
    }

    public String getMyDevicesStatus() {
        return myDevicesStatus;
    }

    public void setMyDevicesStatus(String myDevicesStatus) {
        this.myDevicesStatus = myDevicesStatus;
    }

    public String getNetworkLayer() {
        return networkLayer;
    }

    public void setNetworkLayer(String networkLayer) {
        this.networkLayer = networkLayer;
    }

    public Integer getNotesCount() {
        return notesCount;
    }

    public void setNotesCount(Integer notesCount) {
        this.notesCount = notesCount;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Integer getPelicanCount() {
        return pelicanCount;
    }

    public void setPelicanCount(Integer pelicanCount) {
        this.pelicanCount = pelicanCount;
    }

    public String getPelicanStatus() {
        return pelicanStatus;
    }

    public void setPelicanStatus(String pelicanStatus) {
        this.pelicanStatus = pelicanStatus;
    }

    public Integer getPopupNotification() {
        return popupNotification;
    }

    public void setPopupNotification(Integer popupNotification) {
        this.popupNotification = popupNotification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getQuickLinkName() {
        return quickLinkName;
    }

    public void setQuickLinkName(String quickLinkName) {
        this.quickLinkName = quickLinkName;
    }

    public String getQuickLinkUrl() {
        return quickLinkUrl;
    }

    public void setQuickLinkUrl(String quickLinkUrl) {
        this.quickLinkUrl = quickLinkUrl;
    }

    public Integer getRemoteAccess() {
        return remoteAccess;
    }

    public void setRemoteAccess(Integer remoteAccess) {
        this.remoteAccess = remoteAccess;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getSmsAlert() {
        return smsAlert;
    }

    public void setSmsAlert(Integer smsAlert) {
        this.smsAlert = smsAlert;
    }

    public Integer getSnmpCount() {
        return snmpCount;
    }

    public void setSnmpCount(Integer snmpCount) {
        this.snmpCount = snmpCount;
    }

    public Integer getSnmpObjectCount() {
        return snmpObjectCount;
    }

    public void setSnmpObjectCount(Integer snmpObjectCount) {
        this.snmpObjectCount = snmpObjectCount;
    }

    public String getSnmpObjectStatus() {
        return snmpObjectStatus;
    }

    public void setSnmpObjectStatus(String snmpObjectStatus) {
        this.snmpObjectStatus = snmpObjectStatus;
    }

    public String getSnmpParent() {
        return snmpParent;
    }

    public void setSnmpParent(String snmpParent) {
        this.snmpParent = snmpParent;
    }

    public String getSnmpParentIndex() {
        return snmpParentIndex;
    }

    public void setSnmpParentIndex(String snmpParentIndex) {
        this.snmpParentIndex = snmpParentIndex;
    }

    public String getSnmpStatus() {
        return snmpStatus;
    }

    public void setSnmpStatus(String snmpStatus) {
        this.snmpStatus = snmpStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSubsystemCount() {
        return subsystemCount;
    }

    public void setSubsystemCount(Integer subsystemCount) {
        this.subsystemCount = subsystemCount;
    }

    public String getSubsystemParentId() {
        return subsystemParentId;
    }

    public void setSubsystemParentId(String subsystemParentId) {
        this.subsystemParentId = subsystemParentId;
    }

    public Integer getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserConnectionType() {
        return userConnectionType;
    }

    public void setUserConnectionType(String userConnectionType) {
        this.userConnectionType = userConnectionType;
    }

    public String getUserDataModel() {
        return userDataModel;
    }

    public void setUserDataModel(String userDataModel) {
        this.userDataModel = userDataModel;
    }

    public String getUserDataName() {
        return userDataName;
    }

    public void setUserDataName(String userDataName) {
        this.userDataName = userDataName;
    }

    public String getUserDataType() {
        return userDataType;
    }

    public void setUserDataType(String userDataType) {
        this.userDataType = userDataType;
    }

    public String getUserDataVendor() {
        return userDataVendor;
    }

    public void setUserDataVendor(String userDataVendor) {
        this.userDataVendor = userDataVendor;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Integer getVirtualDeviceType() {
        return virtualDeviceType;
    }

    public void setVirtualDeviceType(Integer virtualDeviceType) {
        this.virtualDeviceType = virtualDeviceType;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getDockerName() {
        return dockerName;
    }

    public void setDockerName(String dockerName) {
        this.dockerName = dockerName;
    }

    public String getDockerVdmsId() {
        return dockerVdmsId;
    }

    public void setDockerVdmsId(String dockerVdmsId) {
        this.dockerVdmsId = dockerVdmsId;
    }

    public String getGlobalVendorId() {
        return globalVendorId;
    }

    public void setGlobalVendorId(String globalVendorId) {
        this.globalVendorId = globalVendorId;
    }

    public String getLocalVendorId() {
        return localVendorId;
    }

    public void setLocalVendorId(String localVendorId) {
        this.localVendorId = localVendorId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getOtherVendor1Id() {
        return otherVendor1Id;
    }

    public void setOtherVendor1Id(String otherVendor1Id) {
        this.otherVendor1Id = otherVendor1Id;
    }

    public String getOtherVendor2Id() {
        return otherVendor2Id;
    }

    public void setOtherVendor2Id(String otherVendor2Id) {
        this.otherVendor2Id = otherVendor2Id;
    }

    public String getOtherVendor3Id() {
        return otherVendor3Id;
    }

    public void setOtherVendor3Id(String otherVendor3Id) {
        this.otherVendor3Id = otherVendor3Id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getMeasuringInstrumentStatus() {
        return measuringInstrumentStatus;
    }

    public void setMeasuringInstrumentStatus(String measuringInstrumentStatus) {
        this.measuringInstrumentStatus = measuringInstrumentStatus;
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

    public Integer getDaintreeCount() {
        return daintreeCount;
    }

    public void setDaintreeCount(Integer daintreeCount) {
        this.daintreeCount = daintreeCount;
    }

    public String getDaintreeStatus() {
        return daintreeStatus;
    }

    public void setDaintreeStatus(String daintreeStatus) {
        this.daintreeStatus = daintreeStatus;
    }

    public Integer getQrcodeCount() {
        return qrcodeCount;
    }

    public void setQrcodeCount(Integer qrcodeCount) {
        this.qrcodeCount = qrcodeCount;
    }

    public String getAssetImageUrl() {
        return assetImageUrl;
    }

    public void setAssetImageUrl(String assetImageUrl) {
        this.assetImageUrl = assetImageUrl;
    }

    public BigDecimal getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(BigDecimal createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public Integer getEcobeeCount() {
        return ecobeeCount;
    }

    public void setEcobeeCount(Integer ecobeeCount) {
        this.ecobeeCount = ecobeeCount;
    }

    public String getEcobeeStatus() {
        return ecobeeStatus;
    }

    public void setEcobeeStatus(String ecobeeStatus) {
        this.ecobeeStatus = ecobeeStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeviceEntity that = (DeviceEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (alarm != null ? !alarm.equals(that.alarm) : that.alarm != null) return false;
        if (assetMatchStatus != null ? !assetMatchStatus.equals(that.assetMatchStatus) : that.assetMatchStatus != null)
            return false;
        if (bacnetCount != null ? !bacnetCount.equals(that.bacnetCount) : that.bacnetCount != null) return false;
        if (bacnetStatus != null ? !bacnetStatus.equals(that.bacnetStatus) : that.bacnetStatus != null) return false;
        if (checklistTemplateCount != null ? !checklistTemplateCount.equals(that.checklistTemplateCount) : that.checklistTemplateCount != null)
            return false;
        if (connectionType != null ? !connectionType.equals(that.connectionType) : that.connectionType != null)
            return false;
        if (customFields != null ? !customFields.equals(that.customFields) : that.customFields != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;
        if (disruptiveCount != null ? !disruptiveCount.equals(that.disruptiveCount) : that.disruptiveCount != null)
            return false;
        if (disruptiveStatus != null ? !disruptiveStatus.equals(that.disruptiveStatus) : that.disruptiveStatus != null)
            return false;
        if (documentCount != null ? !documentCount.equals(that.documentCount) : that.documentCount != null)
            return false;
        if (emailAlert != null ? !emailAlert.equals(that.emailAlert) : that.emailAlert != null) return false;
        if (interfaceCount != null ? !interfaceCount.equals(that.interfaceCount) : that.interfaceCount != null)
            return false;
        if (ipAddress != null ? !ipAddress.equals(that.ipAddress) : that.ipAddress != null) return false;
        if (knxCount != null ? !knxCount.equals(that.knxCount) : that.knxCount != null) return false;
        if (knxStatus != null ? !knxStatus.equals(that.knxStatus) : that.knxStatus != null) return false;
        if (lastSeenOn != null ? !lastSeenOn.equals(that.lastSeenOn) : that.lastSeenOn != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (localVendorEmailAlert != null ? !localVendorEmailAlert.equals(that.localVendorEmailAlert) : that.localVendorEmailAlert != null)
            return false;
        if (localVendorSmsAlert != null ? !localVendorSmsAlert.equals(that.localVendorSmsAlert) : that.localVendorSmsAlert != null)
            return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (lorawanCount != null ? !lorawanCount.equals(that.lorawanCount) : that.lorawanCount != null) return false;
        if (lorawanStatus != null ? !lorawanStatus.equals(that.lorawanStatus) : that.lorawanStatus != null)
            return false;
        if (macAddress != null ? !macAddress.equals(that.macAddress) : that.macAddress != null) return false;
        if (matchedProductIds != null ? !matchedProductIds.equals(that.matchedProductIds) : that.matchedProductIds != null)
            return false;
        if (measuringInstrumentCount != null ? !measuringInstrumentCount.equals(that.measuringInstrumentCount) : that.measuringInstrumentCount != null)
            return false;
        if (mediaCount != null ? !mediaCount.equals(that.mediaCount) : that.mediaCount != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (monitor != null ? !monitor.equals(that.monitor) : that.monitor != null) return false;
        if (monnitCount != null ? !monnitCount.equals(that.monnitCount) : that.monnitCount != null) return false;
        if (monnitStatus != null ? !monnitStatus.equals(that.monnitStatus) : that.monnitStatus != null) return false;
        if (myDevicesCount != null ? !myDevicesCount.equals(that.myDevicesCount) : that.myDevicesCount != null)
            return false;
        if (myDevicesStatus != null ? !myDevicesStatus.equals(that.myDevicesStatus) : that.myDevicesStatus != null)
            return false;
        if (networkLayer != null ? !networkLayer.equals(that.networkLayer) : that.networkLayer != null) return false;
        if (notesCount != null ? !notesCount.equals(that.notesCount) : that.notesCount != null) return false;
        if (parent != null ? !parent.equals(that.parent) : that.parent != null) return false;
        if (pelicanCount != null ? !pelicanCount.equals(that.pelicanCount) : that.pelicanCount != null) return false;
        if (pelicanStatus != null ? !pelicanStatus.equals(that.pelicanStatus) : that.pelicanStatus != null)
            return false;
        if (popupNotification != null ? !popupNotification.equals(that.popupNotification) : that.popupNotification != null)
            return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (quickLinkName != null ? !quickLinkName.equals(that.quickLinkName) : that.quickLinkName != null)
            return false;
        if (quickLinkUrl != null ? !quickLinkUrl.equals(that.quickLinkUrl) : that.quickLinkUrl != null) return false;
        if (remoteAccess != null ? !remoteAccess.equals(that.remoteAccess) : that.remoteAccess != null) return false;
        if (serialNumber != null ? !serialNumber.equals(that.serialNumber) : that.serialNumber != null) return false;
        if (smsAlert != null ? !smsAlert.equals(that.smsAlert) : that.smsAlert != null) return false;
        if (snmpCount != null ? !snmpCount.equals(that.snmpCount) : that.snmpCount != null) return false;
        if (snmpObjectCount != null ? !snmpObjectCount.equals(that.snmpObjectCount) : that.snmpObjectCount != null)
            return false;
        if (snmpObjectStatus != null ? !snmpObjectStatus.equals(that.snmpObjectStatus) : that.snmpObjectStatus != null)
            return false;
        if (snmpParent != null ? !snmpParent.equals(that.snmpParent) : that.snmpParent != null) return false;
        if (snmpParentIndex != null ? !snmpParentIndex.equals(that.snmpParentIndex) : that.snmpParentIndex != null)
            return false;
        if (snmpStatus != null ? !snmpStatus.equals(that.snmpStatus) : that.snmpStatus != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (subsystemCount != null ? !subsystemCount.equals(that.subsystemCount) : that.subsystemCount != null)
            return false;
        if (subsystemParentId != null ? !subsystemParentId.equals(that.subsystemParentId) : that.subsystemParentId != null)
            return false;
        if (ticketCount != null ? !ticketCount.equals(that.ticketCount) : that.ticketCount != null) return false;
        if (ticketStatus != null ? !ticketStatus.equals(that.ticketStatus) : that.ticketStatus != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (userConnectionType != null ? !userConnectionType.equals(that.userConnectionType) : that.userConnectionType != null)
            return false;
        if (userDataModel != null ? !userDataModel.equals(that.userDataModel) : that.userDataModel != null)
            return false;
        if (userDataName != null ? !userDataName.equals(that.userDataName) : that.userDataName != null) return false;
        if (userDataType != null ? !userDataType.equals(that.userDataType) : that.userDataType != null) return false;
        if (userDataVendor != null ? !userDataVendor.equals(that.userDataVendor) : that.userDataVendor != null)
            return false;
        if (vendor != null ? !vendor.equals(that.vendor) : that.vendor != null) return false;
        if (virtualDeviceType != null ? !virtualDeviceType.equals(that.virtualDeviceType) : that.virtualDeviceType != null)
            return false;
        if (warranty != null ? !warranty.equals(that.warranty) : that.warranty != null) return false;
        if (dockerName != null ? !dockerName.equals(that.dockerName) : that.dockerName != null) return false;
        if (dockerVdmsId != null ? !dockerVdmsId.equals(that.dockerVdmsId) : that.dockerVdmsId != null) return false;
        if (globalVendorId != null ? !globalVendorId.equals(that.globalVendorId) : that.globalVendorId != null)
            return false;
        if (localVendorId != null ? !localVendorId.equals(that.localVendorId) : that.localVendorId != null)
            return false;
        if (locationId != null ? !locationId.equals(that.locationId) : that.locationId != null) return false;
        if (otherVendor1Id != null ? !otherVendor1Id.equals(that.otherVendor1Id) : that.otherVendor1Id != null)
            return false;
        if (otherVendor2Id != null ? !otherVendor2Id.equals(that.otherVendor2Id) : that.otherVendor2Id != null)
            return false;
        if (otherVendor3Id != null ? !otherVendor3Id.equals(that.otherVendor3Id) : that.otherVendor3Id != null)
            return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (measuringInstrumentStatus != null ? !measuringInstrumentStatus.equals(that.measuringInstrumentStatus) : that.measuringInstrumentStatus != null)
            return false;
        if (recordChecklistCount != null ? !recordChecklistCount.equals(that.recordChecklistCount) : that.recordChecklistCount != null)
            return false;
        if (recordChecklistStatus != null ? !recordChecklistStatus.equals(that.recordChecklistStatus) : that.recordChecklistStatus != null)
            return false;
        if (daintreeCount != null ? !daintreeCount.equals(that.daintreeCount) : that.daintreeCount != null)
            return false;
        if (daintreeStatus != null ? !daintreeStatus.equals(that.daintreeStatus) : that.daintreeStatus != null)
            return false;
        if (qrcodeCount != null ? !qrcodeCount.equals(that.qrcodeCount) : that.qrcodeCount != null) return false;
        if (assetImageUrl != null ? !assetImageUrl.equals(that.assetImageUrl) : that.assetImageUrl != null)
            return false;
        if (createdTimestamp != null ? !createdTimestamp.equals(that.createdTimestamp) : that.createdTimestamp != null)
            return false;
        if (ecobeeCount != null ? !ecobeeCount.equals(that.ecobeeCount) : that.ecobeeCount != null) return false;
        if (ecobeeStatus != null ? !ecobeeStatus.equals(that.ecobeeStatus) : that.ecobeeStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (alarm != null ? alarm.hashCode() : 0);
        result = 31 * result + (assetMatchStatus != null ? assetMatchStatus.hashCode() : 0);
        result = 31 * result + (bacnetCount != null ? bacnetCount.hashCode() : 0);
        result = 31 * result + (bacnetStatus != null ? bacnetStatus.hashCode() : 0);
        result = 31 * result + (checklistTemplateCount != null ? checklistTemplateCount.hashCode() : 0);
        result = 31 * result + (connectionType != null ? connectionType.hashCode() : 0);
        result = 31 * result + (customFields != null ? customFields.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        result = 31 * result + (disruptiveCount != null ? disruptiveCount.hashCode() : 0);
        result = 31 * result + (disruptiveStatus != null ? disruptiveStatus.hashCode() : 0);
        result = 31 * result + (documentCount != null ? documentCount.hashCode() : 0);
        result = 31 * result + (emailAlert != null ? emailAlert.hashCode() : 0);
        result = 31 * result + (interfaceCount != null ? interfaceCount.hashCode() : 0);
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        result = 31 * result + (knxCount != null ? knxCount.hashCode() : 0);
        result = 31 * result + (knxStatus != null ? knxStatus.hashCode() : 0);
        result = 31 * result + (lastSeenOn != null ? lastSeenOn.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (localVendorEmailAlert != null ? localVendorEmailAlert.hashCode() : 0);
        result = 31 * result + (localVendorSmsAlert != null ? localVendorSmsAlert.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (lorawanCount != null ? lorawanCount.hashCode() : 0);
        result = 31 * result + (lorawanStatus != null ? lorawanStatus.hashCode() : 0);
        result = 31 * result + (macAddress != null ? macAddress.hashCode() : 0);
        result = 31 * result + (matchedProductIds != null ? matchedProductIds.hashCode() : 0);
        result = 31 * result + (measuringInstrumentCount != null ? measuringInstrumentCount.hashCode() : 0);
        result = 31 * result + (mediaCount != null ? mediaCount.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (monitor != null ? monitor.hashCode() : 0);
        result = 31 * result + (monnitCount != null ? monnitCount.hashCode() : 0);
        result = 31 * result + (monnitStatus != null ? monnitStatus.hashCode() : 0);
        result = 31 * result + (myDevicesCount != null ? myDevicesCount.hashCode() : 0);
        result = 31 * result + (myDevicesStatus != null ? myDevicesStatus.hashCode() : 0);
        result = 31 * result + (networkLayer != null ? networkLayer.hashCode() : 0);
        result = 31 * result + (notesCount != null ? notesCount.hashCode() : 0);
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        result = 31 * result + (pelicanCount != null ? pelicanCount.hashCode() : 0);
        result = 31 * result + (pelicanStatus != null ? pelicanStatus.hashCode() : 0);
        result = 31 * result + (popupNotification != null ? popupNotification.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (quickLinkName != null ? quickLinkName.hashCode() : 0);
        result = 31 * result + (quickLinkUrl != null ? quickLinkUrl.hashCode() : 0);
        result = 31 * result + (remoteAccess != null ? remoteAccess.hashCode() : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        result = 31 * result + (smsAlert != null ? smsAlert.hashCode() : 0);
        result = 31 * result + (snmpCount != null ? snmpCount.hashCode() : 0);
        result = 31 * result + (snmpObjectCount != null ? snmpObjectCount.hashCode() : 0);
        result = 31 * result + (snmpObjectStatus != null ? snmpObjectStatus.hashCode() : 0);
        result = 31 * result + (snmpParent != null ? snmpParent.hashCode() : 0);
        result = 31 * result + (snmpParentIndex != null ? snmpParentIndex.hashCode() : 0);
        result = 31 * result + (snmpStatus != null ? snmpStatus.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (subsystemCount != null ? subsystemCount.hashCode() : 0);
        result = 31 * result + (subsystemParentId != null ? subsystemParentId.hashCode() : 0);
        result = 31 * result + (ticketCount != null ? ticketCount.hashCode() : 0);
        result = 31 * result + (ticketStatus != null ? ticketStatus.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (userConnectionType != null ? userConnectionType.hashCode() : 0);
        result = 31 * result + (userDataModel != null ? userDataModel.hashCode() : 0);
        result = 31 * result + (userDataName != null ? userDataName.hashCode() : 0);
        result = 31 * result + (userDataType != null ? userDataType.hashCode() : 0);
        result = 31 * result + (userDataVendor != null ? userDataVendor.hashCode() : 0);
        result = 31 * result + (vendor != null ? vendor.hashCode() : 0);
        result = 31 * result + (virtualDeviceType != null ? virtualDeviceType.hashCode() : 0);
        result = 31 * result + (warranty != null ? warranty.hashCode() : 0);
        result = 31 * result + (dockerName != null ? dockerName.hashCode() : 0);
        result = 31 * result + (dockerVdmsId != null ? dockerVdmsId.hashCode() : 0);
        result = 31 * result + (globalVendorId != null ? globalVendorId.hashCode() : 0);
        result = 31 * result + (localVendorId != null ? localVendorId.hashCode() : 0);
        result = 31 * result + (locationId != null ? locationId.hashCode() : 0);
        result = 31 * result + (otherVendor1Id != null ? otherVendor1Id.hashCode() : 0);
        result = 31 * result + (otherVendor2Id != null ? otherVendor2Id.hashCode() : 0);
        result = 31 * result + (otherVendor3Id != null ? otherVendor3Id.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (measuringInstrumentStatus != null ? measuringInstrumentStatus.hashCode() : 0);
        result = 31 * result + (recordChecklistCount != null ? recordChecklistCount.hashCode() : 0);
        result = 31 * result + (recordChecklistStatus != null ? recordChecklistStatus.hashCode() : 0);
        result = 31 * result + (daintreeCount != null ? daintreeCount.hashCode() : 0);
        result = 31 * result + (daintreeStatus != null ? daintreeStatus.hashCode() : 0);
        result = 31 * result + (qrcodeCount != null ? qrcodeCount.hashCode() : 0);
        result = 31 * result + (assetImageUrl != null ? assetImageUrl.hashCode() : 0);
        result = 31 * result + (createdTimestamp != null ? createdTimestamp.hashCode() : 0);
        result = 31 * result + (ecobeeCount != null ? ecobeeCount.hashCode() : 0);
        result = 31 * result + (ecobeeStatus != null ? ecobeeStatus.hashCode() : 0);
        return result;
    }
}
