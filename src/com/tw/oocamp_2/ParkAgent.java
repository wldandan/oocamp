package com.tw.oocamp_2;

import java.util.*;

public class ParkAgent {
    private Map<String,ParkingLot> parkingLots = new LinkedHashMap<String, ParkingLot>();

    public void addPark(ParkingLot... parkingLots) {
        for(ParkingLot parkingLot : parkingLots){
            this.parkingLots.put(parkingLot.getId(),parkingLot);
        }
    }

    public String park(Car car) {
        for (ParkingLot parkingLot : parkingLots.values()) {
            String parkingId = parkingLot.park(car);
            if (parkingId != null) {
                return parkingLot.getId() + ":" + parkingId;
            }
        }
        return null;
    }

    public Car pickUp(String parkingId) {
        String[] parkingInfo = parkingId.split(":");
        String parkingLotId = parkingInfo[0];
        String carId = parkingInfo[1];
        return parkingLots.get(parkingLotId).pickUp(carId);
    }
}
