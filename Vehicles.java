//Q No: 04 Vehicle Inheritance
class Vehicle {
    private String model;
    private int year;
    private String color;

    public Vehicle(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayDetails() {
        System.out.println("Model:" + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, int year, String color, int numberOfDoors) {
        super(model, year, color);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors:"+ numberOfDoors);
    }
}
class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String model, int year, String color, int engineCapacity) {
        super(model, year, color);
        this.engineCapacity = engineCapacity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity);
    }
}
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String model, int year, String color, double loadCapacity) {
        super(model, year, color);
        this.loadCapacity = loadCapacity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity:" + loadCapacity);
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", 2022, "Black", 4);
        Motorcycle motorcycle = new Motorcycle("BMW", 2023, "White", 500);
        Truck truck = new Truck("Lahore Movers", 2021, "Red", 2.5);

        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("Motorcycle Details:");
        motorcycle.displayDetails();

        System.out.println("Truck Details:");
        truck.displayDetails();
    }
}
