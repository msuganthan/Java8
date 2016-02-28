package Lambdas;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sugan_000 on 2/28/2016.
 */
public class LambdasTest01 {

    JFrame frame = new JFrame();
    public LambdasTest01() {
        addButtonAndEvents();
    }

    public void addButtonAndEvents() {
        frame = new JFrame("Java Swing Examples");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        JButton button = new JButton("Click me");
        button.setSize(100, 20);
        frame.add(button);

        //Power of lambdas
        button.addActionListener( e -> System.out.println("Button got clicked"));
    }

    public static void main(String[] args) {
        LambdasTest01 lambdasTest01 = new LambdasTest01();
    }
}
