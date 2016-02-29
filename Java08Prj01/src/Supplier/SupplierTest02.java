package Supplier;

import java.util.function.Supplier;

/**
 * Created by sugan_000 on 3/1/2016.
 */
public class SupplierTest02 {

    public <X> X getX(Supplier<? extends X> supplier) {
        X x = supplier.get();
        System.out.println(x+" was created");
        return x;
    }

    public static void main(String[] args) {
        SupplierTest02 supplierTest = new SupplierTest02();
        Shape shape = supplierTest.getX(() -> new Circle());
        shape.draw();
        System.out.println("================================");
        shape = supplierTest.getX(() -> new Rectangle());
        shape.draw();
        System.out.println("================================");
        shape = supplierTest.getX(() -> new Square());
        shape.draw();
        System.out.println("================================");

        Vehicle vehicle = supplierTest.getX(() -> new Car());
        vehicle.operate();
        System.out.println("================================");
        vehicle = supplierTest.getX(() -> new Truck());
        vehicle.operate();
        System.out.println("================================");
        vehicle = supplierTest.getX(() -> new Bike());
        vehicle.operate();
        System.out.println("================================");

    }
}
