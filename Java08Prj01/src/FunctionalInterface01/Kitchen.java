package FunctionalInterface01;

/**
 * Created by sugan_000 on 2/28/2016.
 */
public class Kitchen {

    public static void main(String args[]) {
        Cook cook = new Cook() {
            @Override
            public void cook() {
                System.out.println("I am an anonymous cook ");
            }
        };
        cook.cook();

        Cook cook1 = () -> System.out.println("I am a lambda cook :) ");
        cook1.cook();
    }

}
