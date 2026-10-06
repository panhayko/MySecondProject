
class Car {
    String brand;
    int year;

    void startEngine() {
        System.out.println(brand + " engine started!");
    }
}

public class MainApp {
    public static void main(String[] args) {
    
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.year = 2022;

        myCar.startEngine();
    }
}