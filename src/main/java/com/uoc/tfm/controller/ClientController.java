package com.uoc.tfm.controller;

import com.uoc.tfm.commons.domain.StationsLocation;
import com.uoc.tfm.commons.domain.StationsStatus;
import org.springframework.web.bind.annotation.GetMapping;

public interface ClientController {

    @GetMapping("/location")
    public StationsLocation getStationsLocation();

    @GetMapping("/status")
    public StationsStatus getStationStatus();

}
