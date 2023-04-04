package com.ontology.digital_building_ontology.controller;

import com.ontology.digital_building_ontology.entity.DeviceEntity;
import com.ontology.digital_building_ontology.service.DeviceEntityService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/vdms-device")
public class DeviceEntityController {
    private final DeviceEntityService deviceEntityService;
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(deviceEntityService.getAll());
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody DeviceEntity deviceEntity){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(deviceEntityService.save(deviceEntity));
    }
}
