package one.digitalinnovation.parking.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.HashMap;
import java.util.*;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import one.digitalinnovation.parking.model.Parking;

@Service
public class ParkingService {
    private static Map<String, Parking> parkingMap = new HashMap();
    static {
        var id = getUUID();
        Parking parking = new Parking(id, "DMS-1111", "sc", "Celta", "Preto");
        parkingMap.put(id, parking);
    }

    public List<Parking> findAll() {
        return parkingMap.values().stream().collect(Collectors.toList());
        // return Arrays.asList();
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
