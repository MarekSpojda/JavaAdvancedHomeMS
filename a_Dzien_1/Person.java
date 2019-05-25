package a_Dzien_1;

public class Person implements Comparable<Person> {

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

    @SuppressWarnings("unused")
    public String getFirstName() {
        return firstName;
    }

    @SuppressWarnings("unused")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @SuppressWarnings("WeakerAccess")
    public String getLastName() {
        return lastName;
    }

    @SuppressWarnings("unused")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "lastName= " + lastName + " firstName, = " + firstName;
    }


    @Override
    public int compareTo(Person o) {
        String current = "" + this.getLastName().toCharArray()[0];
        String toCompare = "" + o.getLastName().toCharArray()[0];
        return current.compareTo(toCompare);
    }
}
