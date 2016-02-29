package Supplier;

/**
 * Created by sugan_000 on 3/1/2016.
 */
public interface Shape {
    void draw();
}

class Rectangle implements Shape {
    public void draw() { System.out.println("Draw Rectangle"); }
    public String toString() { return "Rectangle"; }
}

class Circle implements Shape {
    public void draw() { System.out.println("Draw Circle"); }
    public String toString() { return "Circle"; }
}

class Square implements Shape {
    public void draw() { System.out.println("Draw Square"); }
    public String toString() { return "Square"; }
}
