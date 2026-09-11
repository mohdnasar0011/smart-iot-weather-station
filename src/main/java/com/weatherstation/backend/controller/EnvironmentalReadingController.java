package com.weatherstation.backend.controller;

import com.weatherstation.backend.dto.EnvironmentalReadingRequest;
import com.weatherstation.backend.service.EnvironmentalReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/httpEnvironmentalReading")
public class EnvironmentalReadingController {

    @Autowired
    EnvironmentalReadingService environmentalReadingService;

    @GetMapping("/")
    public ResponseEntity<?> readings(@RequestBody EnvironmentalReadingRequest environmentalReading){
        return ResponseEntity.ok().build();

    }

}
