package rikkei.academy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Kiem Square
        System.out.println("===========Square=====");
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "Yellow", true);
        System.out.println(square);
        System.out.println("==============Comparable============");


        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println(comparableCircle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorter: ");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println(comparableCircle);
        }
    }
}
