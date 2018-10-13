package lab9Tour;

public class Main {
    public static void main(String[] args) {
        PackageTour tourBangkok = new PackageTour("Wat In Bangkok");
        tourBangkok.addSingleTour(new SingleTour("Wat Pra Kaew", 150, 10, 5));
        tourBangkok.addSingleTour(new SingleTour("Floating Market", 150, 12, 5));

        System.out.println("Tour package name : " + tourBangkok.getName());
        System.out.println("Total price : " + tourBangkok.getPrice());
        System.out.println("Total available seats : " + tourBangkok.getAvailableSeats());
    }
}
