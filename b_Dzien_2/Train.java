package b_Dzien_2;

public class Train extends Vehicle {
    private int trackWidth;

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }

    public Train(int maxSpeed, String model, int trackWidth) {
        super(maxSpeed, model);
        this.trackWidth = trackWidth;
    }
}
