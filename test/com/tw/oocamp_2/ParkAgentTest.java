package com.tw.oocamp_2;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

public class ParkAgentTest {

    private ParkAgent agent;

    @Before
    public void setUp(){
        agent = new ParkAgent(new NormalChooser());
        ParkingLot parkingLot1 = new ParkingLot("1",1);
        ParkingLot parkingLot2 = new ParkingLot("2",1);
        agent.addPark(parkingLot1, parkingLot2);
    }

    @Test
    public void should_park_to_1_when_1_not_full(){
        Car car1 = new Car("1");
        assertEquals("1:1", agent.park(car1));
    }

    @Test
    public void should_park_to_2_when_1_is_full(){
        Car car1 = new Car("1");
        Car car2 = new Car("2");
        assertEquals("1:1",agent.park(car1));
        assertEquals("2:2", agent.park(car2));
    }

    @Test
    public void should_fail_when_both_full(){
        Car car1 = new Car("1");
        Car car2 = new Car("2");
        Car car3 = new Car("3");
        assertEquals("1:1",agent.park(car1));
        assertEquals("2:2",agent.park(car2));
        assertNull(agent.park(car3));
    }

    @Test
    public void should_pickup_parked_car(){
        Car car1 = new Car("1");
        agent.park(car1);
        assertSame(car1,agent.pickUp("1:1"));
    }

    @Test
    public void should_not_pickup_unparked_car(){
        assertNull(agent.pickUp("1:1"));
    }

    @Test
    public void should_park_when_1_and_2_are_full(){
        agent = new ParkAgent(new NormalChooser());
        ParkingLot parkingLot1 = new ParkingLot("1",0);
        ParkingLot parkingLot2 = new ParkingLot("2",0);
        ParkingLot parkingLot3 = new ParkingLot("3",1);

        agent.addPark(parkingLot1, parkingLot2, parkingLot3);
        Car car = new Car("1");
        assertEquals(agent.park(car), "3:1");
        assertEquals(car, agent.pickUp("3:1"));
    }
}

