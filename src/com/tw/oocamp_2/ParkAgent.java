package com.tw.oocamp_2;

import java.util.*;

public class ParkAgent {

    private Map<String, ParkingLot> parkingLots = new LinkedHashMap<String, ParkingLot>();
    private Chooser normalChooser;

    public ParkAgent(Chooser normalChooser1) {
        normalChooser = normalChooser1;
    }

    public void addPark(ParkingLot... parkingLots) {
        for (ParkingLot parkingLot : parkingLots) {
            this.parkingLots.put(parkingLot.getId(), parkingLot);
        }
    }

    public String park(Car car) {
        ParkingLot selectedParkingLot = getChooser().select(parkingLots);
        if (selectedParkingLot != null) {
            String carId = selectedParkingLot.park(car);
            return selectedParkingLot.getId() + ":" + carId;
        }
        return null;
    }

    protected Chooser getChooser() {
        ;
        return normalChooser;
    }

    public Car pickUp(String parkingId) {
        String[] parkingInfo = parkingId.split(":");
        String parkingLotId = parkingInfo[0];
        String carId = parkingInfo[1];
        return parkingLots.get(parkingLotId).pickUp(carId);
    }
}
