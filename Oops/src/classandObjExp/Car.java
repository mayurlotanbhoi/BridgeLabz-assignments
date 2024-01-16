package classandObjExp;

public class Car {

    // this is Attribute or instance variable
    int star, wheel, price;
    String brand, model;

    // this is default constructor
    public Car() {

    }

    // paramiterize costructor
    public Car(int star, int wheel, int price, String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.star = star;
        this.wheel = wheel;
        this.price = price;
    }

    

    // this is method or behevoir of class
    public void startCar() {
        System.out.println("Car starting");
    }

    public void startCar(String methodOfStart) {
        System.out.println("Car starting method" + methodOfStart);
    }

}
