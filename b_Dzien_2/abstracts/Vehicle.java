package b_Dzien_2.abstracts;

public abstract class Vehicle {
    private int maxSpeed;
    protected String model;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Class : " + this.getClass().getSimpleName() + ", model: " + this.getModel() + ", speed: " + this.getMaxSpeed();
    }
}
