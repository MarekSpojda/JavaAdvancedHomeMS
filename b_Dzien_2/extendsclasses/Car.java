package b_Dzien_2.extendsclasses;

import b_Dzien_2.abstracts.Vehicle;
import b_Dzien_2.interfaces.Inspectionable;

public class Car extends Vehicle implements Inspectionable {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(int maxSpeed, String model, String type) {
        super(maxSpeed, model);
        this.type = type;
    }

    @Override
    public void createInspection() {
        System.out.println("Model: " + this.getModel() + " - sprawdzony");
    }
}
