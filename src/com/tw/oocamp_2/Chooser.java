package com.tw.oocamp_2;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/9/12
 * Time: 8:33 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Chooser {
    ParkingLot select(Map<String, ParkingLot> parkingLots);
}
