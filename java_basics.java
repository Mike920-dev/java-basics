package com.gmail.slezak.realmichal;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.print("Give me the edge: ");
        double edge = scanner.nextDouble();
        double totalField = 6 *(edge * edge);
        double capacity = edge * edge * edge;
        System.out.println("Total field: " + totalField);
        System.out.println("Volume: " + capacity);

       //2
        System.out.print("Give me first edge:");
        double edgeFirst =  scanner.nextDouble();
        System.out.println("Give me another edge: ");
        double edgeSec = scanner.nextDouble();
        System.out.print("Give me height: ");
        double height = scanner.nextDouble();
        double field;
        field = 2 * (edgeFirst * edgeSec) + 2 * (edgeSec * height) + 2 * (edgeFirst * height);
        double capacity2 = edgeFirst * edgeSec * height;
        System.out.println("Total cuboid field: "+ field);
        System.out.println("Cuboid volume: " + capacity2);

        //3
        final double pi = 3.14;
        System.out.print("Give me wheel radius:");
        double radius = scanner.nextDouble();
        double wheelField = pi * (radius * radius);
        double circut = 2 * pi * radius;
        System.out.println("Wheel field: " + wheelField);
        System.out.println("Circut:  " + circut);

        //4
        System.out.print("Give me the year of your brith: ");
        int yearBrith = scanner.nextInt();
        int years = 2020 - yearBrith;
        System.out.println("Yoy've got   " + years + " years");
    }
}
