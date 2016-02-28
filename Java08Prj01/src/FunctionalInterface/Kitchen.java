package FunctionalInterface;

/**
 * Created by sugan_000 on 2/28/2016.
 */
public class Kitchen implements Cook, Cook2, Cook3 {

    @Override
    public void cook() {
        System.out.println("I am cooking");
    }

    // Overriden default method
    @Override
    public void buyVegitables() {
        System.out.println("This time I bought vegitables");
    }


    public static void main(String args[]) {
        Kitchen kitchen = new Kitchen();
        kitchen.buyGrocery(); //:)
        kitchen.buyVegitables();
        kitchen.cook();
        kitchen.myCook3Method();
    }
}
