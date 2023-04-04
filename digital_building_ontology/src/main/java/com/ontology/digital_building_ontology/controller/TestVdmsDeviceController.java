package com.ontology.digital_building_ontology.controller;

import com.ontology.digital_building_ontology.entity.TestVdmsDevice;
import com.ontology.digital_building_ontology.service.TestVdmsDeviceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/device")
public class TestVdmsDeviceController {
    private final TestVdmsDeviceService testVdmsDeviceService;
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(testVdmsDeviceService.getAllCustomer());
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody TestVdmsDevice testVdmsDevice){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(testVdmsDeviceService.saveCustomer(testVdmsDevice));
    }
}
