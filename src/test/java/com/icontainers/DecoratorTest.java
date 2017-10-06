package com.icontainers;

import com.icontainers.decorator.Rider;
import com.icontainers.decorator.Robot;
import com.icontainers.decorator.TeleporterRider;
import com.icontainers.decorator.TransportationMean;
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