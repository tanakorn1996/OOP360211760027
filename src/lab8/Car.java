package lab8;
//1. Color - String
//2. Brand - String
//3. carID - String
//4. Engine  (has-a relation) - Engine
public class Car {
    private String color;
    private String brand;
    private String carID;
    private Engine engine;

    //constructor
    public Car(){}

    public Car(String color, String brand, String carID, Engine engine) {
        this.color = color;
        this.brand = brand;
        this.carID = carID;
        this.engine = engine;
    }
    //toString

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", carID='" + carID + '\'' +
                ", engine=" + engine +
                '}';
    }
    //getter and setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}//class