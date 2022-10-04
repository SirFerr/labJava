package _3lab;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Cup cup = new Cup(0.12,0.36,"White");
        System.out.println(cup.toString());
        System.out.println(cup.getSize());
        cup.setHeight(0.15);
        System.out.println(cup.getSize());
        Plate plate = new Plate(0.06,0.22,"Blue");
        System.out.println(plate.toString());
        System.out.println(plate.getSize());
        plate.setDepth(0.05);
        System.out.println(plate.getSize());
    }
}