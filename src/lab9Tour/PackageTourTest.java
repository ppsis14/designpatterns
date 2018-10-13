package lab9Tour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PackageTourTest {
    PackageTour tourBangkok = new PackageTour("Wat In Bangkok");

    @Test
    void checkName() {
        Assertions.assertEquals("Wat In Bangkok = ", tourBangkok.getName());
    }

    @Test
    void checkPrice() {
        Assertions.assertEquals(0, tourBangkok.getPrice());
    }

    @Test
    void checkAvailableSeats() {
        Assertions.assertEquals(100, tourBangkok.getAvailableSeats());
    }
}