package com.canutech;

import com.canutech.decorator.Rider;
import com.canutech.decorator.Robot;
import com.canutech.decorator.TeleporterRider;
import com.canutech.decorator.TransportationMean;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {

    @Test
    public void RiderTest() throws Exception {
        Robot rider = new Rider();
        assertEquals(10, rider.getPower());
        assertEquals(TransportationMean.MOTO , rider.escape());
    }

    @Test
    public void teleporterRiderTest() throws Exception {
        Robot rider = new Rider();
        assertEquals(10, rider.getPower());
        assertEquals(TransportationMean.MOTO , rider.escape());

        rider = new TeleporterRider(rider);
        assertEquals(20, rider.getPower());
        assertEquals(TransportationMean.TELE_TRANSPORTATION , rider.escape());
    }
}