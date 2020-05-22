package com.company.figures;

import com.company.figures.IFigure;
import com.company.figuresBuilder.Color;

public class Triangle implements IFigure {
    int fSide, sSide;
    double tSide;

    public Color color;

    public Triangle(Color color, int fSide, int sSide, double tSide) {
        this.fSide = fSide;
        this.sSide = sSide;
        this.tSide = tSide;
        this.color = color;
    }

    double[] getSide() {
        double[] arr = {fSide, sSide, tSide};
        return arr;
    }

    double getHypotenuse() {
        double hypotenuse = 0;
        for (double i : getSide()) {
            if (hypotenuse < i) hypotenuse = i;
        }
        return hypotenuse;
    }

    @Override
    public String draw() {
        return "Figure: Triangle, area " + getArea() + " sq. unit: side length:  " +
                fSide + " unit , " + sSide + " unit , " + tSide + " unit ," + " color : " + getColor() +
                ", hypotenuse: " + getHypotenuse() + "";
    }

    @Override
    public String getColor() {
        return color.toString();
    }


    @Override
    public int getArea() {
        return 1;
    }
}
