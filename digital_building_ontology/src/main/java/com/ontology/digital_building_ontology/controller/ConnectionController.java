package com.ontology.digital_building_ontology.controller;

import com.ontology.digital_building_ontology.entity.Connection;
import com.ontology.digital_building_ontology.service.ConnectionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/connection")
public class ConnectionController {
    private final ConnectionService connectionService;
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(connectionService.getAllOrderItem());
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Connection connection){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(connectionService.saveOrderItem(connection));
    }
}
