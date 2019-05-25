package a_Dzien_1.adds;

public class Test implements InfA{
    public static void main(String[] args) {
        A a1 = new A() {
            public void printValue() {
                System.out.println("A");
            }
        };
        a1.printValue();

        Test t = new Test();
        System.out.println(t.getName());
    }

    public String getName(){
        return "test-name";
    }
}
