package com.uoc.tfm.service;

import com.uoc.tfm.commons.domain.StationsLocation;
import com.uoc.tfm.commons.domain.StationsStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.lang.Math.random;

@Service
public class ClientServiceImpl implements ClientService {

    @Value("${service.name:default}")
    private String serviceName;

    @Override
    public StationsLocation getStationsLocation() {
        StationsLocation stations = new StationsLocation(LocalDate.now());
        stations.addStation(1,0,0,"Clot");
        stations.addStation(2,0,0,"SantVi");
        stations.addStation(3,0,0,"Alpens");
        stations.addStation(4,0,0,"Lima");
        stations.addStation(5,0,0,"Gracia");
        return stations;
    }

    @Override
    public StationsStatus getStationStatus() {
        StationsStatus stationsStatus = new StationsStatus(LocalDateTime.now());
        stationsStatus.addStation(1, 20, (int) (random()*20));
        stationsStatus.addStation(2, 10, (int) (random()*10));
        stationsStatus.addStation(3, 30, (int) (random()*30));
        stationsStatus.addStation(4, 20, (int) (random()*20));
        stationsStatus.addStation(5, 10, (int) (random()*10));

        return stationsStatus;
    }

    @Override
    public String getServiceName() {
        return serviceName;
    }
}
