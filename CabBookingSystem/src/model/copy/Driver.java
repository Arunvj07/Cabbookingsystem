package model.copy;



public class Driver {
    private int driverId;
    private String name;
    private boolean isAvailable;

    public Driver(int driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.isAvailable = true;
    }

    public int getDriverId() { return driverId; }
    public String getName() { return name; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public String toString() {
        return "Driver{" + "ID=" + driverId + ", Name='" + name + '\'' +
               ", Available=" + isAvailable + '}';
    }
}
