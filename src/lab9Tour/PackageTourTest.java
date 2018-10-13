package lab9Tour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PackageTourTest {
    private PackageTour tourBangkok;

    @BeforeEach
    public void setUp(){
        tourBangkok = new PackageTour("Wat In Bangkok");
        tourBangkok.addSingleTour(new SingleTour("Wat Pra Kaew", 150, 10, 5));
        tourBangkok.addSingleTour(new SingleTour("Floating Market", 150, 12, 5));
    }

    @Test
    public void checkName() {
        Assertions.assertEquals("Wat In Bangkok = Wat Pra Kaew : Floating Market : ", tourBangkok.getName());
    }

    @Test
    public void checkPrice() {
        Assertions.assertEquals(270, tourBangkok.getPrice());
    }

    @Test
    public void checkAvailableSeats() {
        Assertions.assertEquals(5, tourBangkok.getAvailableSeats());
    }
}