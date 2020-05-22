package com.company.figuresBuilder;

import com.company.Main;
import com.company.figures.IFigure;
import com.company.figures.Triangle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TriangleBuilder implements IFigureBuilder {
    final int MIN = 5;
    final int MAX = 50;
    @Override
    public IFigure BuildFigure() {

        int fSide = Main.rand.nextInt(MAX) + MIN;
        int sSide = Main.rand.nextInt(MAX) + MIN;
        double side3 = new BigDecimal(Math.sqrt((fSide * fSide + sSide * sSide))).setScale(3, RoundingMode.UP).doubleValue();

        return new Triangle(
                Color.values()[rand.nextInt(Color.values().length)],
                fSide, sSide, side3);


    }
}
