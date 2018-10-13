package lab9Tour;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();

    public PackageTour(String packageName) {
        this.packageName = packageName;
    }

    public void addSingleTour(SingleTour singleTour){
        tours.add(singleTour);
    }

    public List<Tour> getTours() {
        return tours;
    }

    @Override
    public String getName() {
        String allNameTour = "";
        for (Tour t : tours)
            allNameTour += t.getName() + " : ";
        return packageName + " = " + allNameTour;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : tours)
            total += t.getPrice();
        return total*0.9;
    }

    @Override
    public int getAvailableSeats() {
        int min = 100;
        for (Tour t : tours)
            if (t.getAvailableSeats() < min) min = t.getAvailableSeats();
        return min;
    }
}
