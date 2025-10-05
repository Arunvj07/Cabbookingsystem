package servicecbs;

import model.copy.Cab;
import java.util.*;

public class CabService {
    private List<Cab> cabs = new ArrayList<>();

    public void addCab(Cab cab) { cabs.add(cab); }

    public Cab getAvailableCab() {
        for (Cab cab : cabs) {
            if (cab.isAvailable()) return cab;
        }
        return null;
    }

    public void showCabs() { cabs.forEach(System.out::println); }
}
