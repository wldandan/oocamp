package com.tw.oocamp_2;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/9/12
 * Time: 8:29 PM
 * To change this template use File | Settings | File Templates.
 */
class SmartestChooser implements Chooser {

    public ParkingLot select(Map<String, ParkingLot> parkingLots) {
        int availableSize = 0;
        ParkingLot currentLot = null;
        for (ParkingLot lot : parkingLots.values()) {
            if (lot.getAvailableSize() / lot.getCapacity() > availableSize) {
                availableSize = lot.getAvailableSize() / lot.getCapacity();
                currentLot = lot;
            }
        }
        return currentLot;
    }
}
