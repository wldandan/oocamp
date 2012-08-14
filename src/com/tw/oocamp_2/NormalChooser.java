package com.tw.oocamp_2;

import java.util.Map;

/**
* Created with IntelliJ IDEA.
* User: twer
* Date: 8/9/12
* Time: 8:30 PM
* To change this template use File | Settings | File Templates.
*/
class NormalChooser implements Chooser {
    @Override
    public ParkingLot select(Map<String, ParkingLot> parkingLots) {
        ParkingLot selectedParkingLot = null;
        for (ParkingLot parkingLot : parkingLots.values()) {
            if (parkingLot.getAvailableSize() > 0) {
                selectedParkingLot = parkingLot;
                break;

            }
        }
        return selectedParkingLot;
    }
}
