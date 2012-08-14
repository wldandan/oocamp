package com.tw.oocamp_2;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

public class ParkSmartAgentTest {

    private ParkAgent agent;

    @Before
    public void setUp(){
        agent = new ParkAgent(new SmartChooser());
        ParkingLot parkingLot1 = new ParkingLot("1",2);
        ParkingLot parkingLot2 = new ParkingLot("2",2);
        agent.addPark(parkingLot1, parkingLot2);
    }

    @Test
    public void should_park_to_1_when_2_available_size_equal_1(){
        Car car = new Car("1");
        assertEquals(agent.park(car), "1:1");
    }


    @Test
    public void should_park_to_2_when_2_available_size_greater_than_1(){
        Car car1 = new Car("1");
        assertEquals(agent.park(car1), "1:1");
        Car car2 = new Car("2");
        assertEquals(agent.park(car2), "2:2");
    }

    @Test
    public void should_park_more_cars(){

    }


}

