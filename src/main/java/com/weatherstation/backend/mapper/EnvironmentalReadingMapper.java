package com.weatherstation.backend.mapper;

import com.weatherstation.backend.dto.EnvironmentalReadingRequest;

public class EnvironmentalReadingMapper {

    public com.weatherstation.backend.entity.EnvironmentalReading toEntity(EnvironmentalReadingRequest request) {
        com.weatherstation.backend.entity.EnvironmentalReading environmentalReading = new com.weatherstation.backend.entity.EnvironmentalReading();

        environmentalReading.setDeviceId(request.getDeviceId());
        environmentalReading.setDeviceTimestamp(request.getDeviceTimestamp());
        environmentalReading.setTemperatureC(request.getTemperatureC());
        environmentalReading.setHumidityPercent(request.getHumidityPercent());
        environmentalReading.setPressureHpa(request.getPressureHpa());
        environmentalReading.setWindSpeedKmh(request.getWindSpeedKmh());
        environmentalReading.setWindGustKmh(request.getWindGustKmh());

        return environmentalReading;
    }
    }
