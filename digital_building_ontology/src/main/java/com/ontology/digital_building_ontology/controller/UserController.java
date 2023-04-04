package com.ontology.digital_building_ontology.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/users")
    public String users()
    {
        return "this is user controller";
    }
}
