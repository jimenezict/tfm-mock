package com.uoc.tfm.controller;

import com.uoc.tfm.commons.domain.StationsLocation;
import com.uoc.tfm.commons.domain.StationsStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ClientController {

    @GetMapping("/location/{size}")
    public StationsLocation getStationsLocation(@PathVariable("size") String size);

    @GetMapping("/status/{size}")
    public StationsStatus getStationStatus(@PathVariable("size") String size);

}
