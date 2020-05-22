package com.company.figures;


import com.company.figures.IFigure;
import com.company.figuresBuilder.Color;


public class Circle implements IFigure {
    int radius;
    Color color;


    public Circle(Color color, int radius) {
        this.radius = radius;
        this.color = color;
    }

    int getRadius() {
        return radius;
    }

    @Override
    public String draw() {
        return "Figure: Circle, area " + getArea() + " sq. unit: radius " + radius +
                " unit., color : " + getColor() + ".";
    }

    @Override
    public int getArea() {
        return ((int) (Math.PI * Math.pow(radius, 2)));
    }

    @Override
    public String getColor() {
        return color.toString();
    }


}
