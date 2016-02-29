package Supplier;

/**
 * Created by sugan_000 on 3/1/2016.
 */
public interface Vehicle {
    void operate();
}

class Car implements Vehicle {
    public void operate() { System.out.println("Car started to operate"); }
    public String toString() { return "Car"; }
}

class Bike implements Vehicle {
    public void operate() { System.out.println("Bike started to operate"); }
    public String toString() { return "Bike"; }
}

class Truck implements Vehicle {
    public void operate() { System.out.println("Truck started to operate"); }
    public String toString() { return "Truck"; }
}



