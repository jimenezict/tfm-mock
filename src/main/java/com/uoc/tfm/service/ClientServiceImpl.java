package com.uoc.tfm.service;

import com.uoc.tfm.commons.domain.StationsLocation;
import com.uoc.tfm.commons.domain.StationsStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.lang.Math.floor;
import static java.lang.Math.random;

@Service
public class ClientServiceImpl implements ClientService {

    @Value("${service.name:default}")
    private String serviceName;

    @Override
    public StationsLocation getStationsLocation(Integer size) {
        StationsLocation stations = new StationsLocation(LocalDate.now());
        for (int i = 1; i < size; i++) {
            stations.addStation(i, random() * 100, random() * 100, "Lorem station");
        }

        return stations;
    }

    @Override
    public StationsStatus getStationStatus(Integer size) {
        StationsStatus stationsStatus = new StationsStatus(LocalDateTime.now());

        for (int i = 1; i < size; i++) {
            int stationSize = ((int) floor((random() * 10 + 4))) * 3;
            stationsStatus.addStation(i, stationSize, (int) (random() * stationSize));
        }
        return stationsStatus;
    }

    @Override
    public String getServiceName() {
        return serviceName;
    }
}
