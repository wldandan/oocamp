package com.tw.oocamp_2;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ParkingLotTest {

    @Test
    public void can_park_when_have_position() {
        ParkingLot parkingLot = new ParkingLot("1",5);
        Car car = new Car("abc");
        assertEquals("abc", parkingLot.park(car));
    }

    @Test
    public void can_not_park_when_have_no_position() {
        ParkingLot parkingLot = new ParkingLot("1",0);
        Car car = new Car("abc");
        assertEquals(null, parkingLot.park(car));
    }

    @Test
    public void should_unpark_parked_car(){
        ParkingLot parkingLot = new ParkingLot("1",5);
        Car car = new Car("abc");
        parkingLot.park(car);
        assertEquals(car, parkingLot.pickUp("abc"));
    }

    @Test
    public void should_not_unpark_not_parked_car(){
        ParkingLot parkingLot = new ParkingLot("1",5);
        assertEquals(null, parkingLot.pickUp("abc"));
    }


}
