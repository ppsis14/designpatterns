package lab9Tour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleTourTest {

    SingleTour watPraKaew = new SingleTour("Wat Pra Kaew", 150, 10, 5);
    //SingleTour watPho = new SingleTour("Wat Pho", 150, 10, 2);

    @Test
    public void checkName(){
        Assertions.assertEquals("Wat Pra Kaew", watPraKaew.getName());
    }

    @Test
    public void checkPrice(){
        Assertions.assertEquals(150, watPraKaew.getPrice());
    }

    @Test
    public void checkReserveSeats(){
        Assertions.assertEquals(5, watPraKaew.getReservedSeats());
    }

    @Test
    public void checkAvailableSeats(){
        Assertions.assertEquals(5, watPraKaew.getAvailableSeats());
    }
}