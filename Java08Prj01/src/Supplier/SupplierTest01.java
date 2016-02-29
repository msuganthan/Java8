package Supplier;

import java.util.function.Supplier;

/**
 * Created by sugan_000 on 3/1/2016.
 */
public class SupplierTest01 {
    public Shape getShape(Supplier<? extends Shape> supplier) {
        Shape shape = supplier.get();
        System.out.println(shape+" was created");
        return shape;
    }

    public static void main(String[] args) {
        SupplierTest01 supplierTest = new SupplierTest01();
        Shape shape = supplierTest.getShape(() -> new Circle());
        shape.draw();
        System.out.println("================================");
        shape = supplierTest.getShape(() -> new Rectangle());
        shape.draw();
        System.out.println("================================");
        shape = supplierTest.getShape(() -> new Square());
        shape.draw();
        System.out.println("================================");
    }
}
