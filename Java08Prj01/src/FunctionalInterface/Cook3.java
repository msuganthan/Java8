package FunctionalInterface;

/**
 * Created by sugan_000 on 2/28/2016.
 */
@FunctionalInterface
public interface Cook3 extends Cook {
    //public void cook3();
    //should not have a method named three

    public default void myCook3Method() {
        System.out.println("I am child interface");
    }
}
