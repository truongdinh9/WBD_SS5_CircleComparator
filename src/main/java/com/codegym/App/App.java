package com.codegym.App;

import com.codegym.Circle.Circle;
import com.codegym.Comparatator.CircleComparator;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {


    Circle[] circles =new Circle[3];
    circles[0]=new Circle(1,"red");
    circles[1]=new Circle(2,"blue");
    circles[2]=new Circle();
    CircleComparator circleComparator=new CircleComparator();
        Arrays.sort(circles,circleComparator);

        for (Circle circle:circles
             ) {
            System.out.println(circle);
        }

    }

}
