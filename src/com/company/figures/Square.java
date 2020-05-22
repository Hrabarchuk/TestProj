package com.company.figures;

import com.company.figures.IFigure;
import com.company.figuresBuilder.Color;

public class Square implements IFigure {
    int side;
    Color color;

    public Square(Color color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public String draw() {
        return "Figure: Square, area " + getArea() + " sq. unit: side length " + side +
                "unit., color : " + getColor() + ".";
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return color.toString();
    }
}