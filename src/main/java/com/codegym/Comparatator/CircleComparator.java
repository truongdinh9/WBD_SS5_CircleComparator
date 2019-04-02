package com.codegym.Comparatator;

import com.codegym.Circle.Circle;

public class CircleComparator implements java.util.Comparator<Circle> {


    @Override
    public int compare(Circle c1, Circle c2) {

            if (c1.getRadius() > (c2.getRadius())){
                return 1;
            } else if (c1.getRadius() < c2.getRadius()) {
                return -1;
            } else return 0;

    }
}
