package com.company.figures;

import com.company.figures.IFigure;
import com.company.figuresBuilder.Color;

public class Trapeze implements IFigure {
    int fBase, sBase, height;
    Color color;

    public Trapeze(Color color, int fBase, int sBase, int height) {
        this.fBase = fBase;
        this.sBase = sBase;
        this.height = height;
        this.color = color;
    }

    int[] getSide() {
        int[] arr = {fBase, sBase, height};
        return arr;
    }

    @Override
    public String draw() {
        return "Figure: Trapeze, area " + getArea() + " sq. unit. side length:  " +
                fBase + " unit , " + sBase + " unit , " + height + " unit " +
                ", color : " + getColor() + " ";
    }

    @Override
    public int getArea() {
        return (fBase + sBase) / 2 * height;
    }

    @Override
    public String getColor() {
        return color.toString();
    }
}
