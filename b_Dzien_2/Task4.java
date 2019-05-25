package b_Dzien_2;

public class Task4 {
    public static void main(String[] args) {
        Vehicle[] vehicleTab = new Vehicle[2];
        vehicleTab[0] = new Car(160, "Opel", "osobowy");
        vehicleTab[1] = new Train(220, "Błyskawica", 1434);

        for (Vehicle vehicle : vehicleTab) {
            if (vehicle instanceof Inspectionable) {
                ((Inspectionable) vehicle).createInspection();
            }
            System.out.println(vehicle);
        }
    }
}
