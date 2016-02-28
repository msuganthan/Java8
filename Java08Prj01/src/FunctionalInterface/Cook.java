package FunctionalInterface;

/**
 * Created by sugan_000 on 2/28/2016.
 */
@FunctionalInterface
public interface Cook {

    public void cook();
    public int hashCode();
    public boolean equals(Object obj);

    public default void buyVegitables() {
        System.out.println("I bought Vegitables");
    }

    public default void buyGrocery() {
        System.out.println("I bought grocery");
    }

}
