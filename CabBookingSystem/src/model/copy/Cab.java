package model.copy;

public class Cab {
    private int cabId;
    private String cabModel;
    private String cabNumber;
    private boolean isAvailable;

    public Cab(int cabId, String cabModel, String cabNumber) {
        this.cabId = cabId;
        this.cabModel = cabModel;
        this.cabNumber = cabNumber;
        this.isAvailable = true;
    }

    public int getCabId() { return cabId; }
    public String getCabModel() { return cabModel; }
    public String getCabNumber() { return cabNumber; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public String toString() {
        return "Cab{" + "ID=" + cabId + ", Model='" + cabModel + '\'' +
               ", Number='" + cabNumber + '\'' + ", Available=" + isAvailable + '}';
    }
}
