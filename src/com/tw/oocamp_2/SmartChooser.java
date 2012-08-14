package com.tw.oocamp_2;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/9/12
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
class SmartChooser implements Chooser {
    public ParkingLot select(Map<String, ParkingLot> parkingLots) {
        int availableSize = 0;
        ParkingLot currentLot = null;
        for (ParkingLot lot : parkingLots.values()) {
            if (lot.getAvailableSize() > availableSize) {
                availableSize = lot.getAvailableSize();
                currentLot = lot;
            }
        }
        return currentLot;
    }

}
