package com.company.figuresBuilder;


import com.company.Main;
import com.company.figures.IFigure;
import com.company.figures.Square;

public class SquareBuilder implements IFigureBuilder {
    final int MIN = 5;
    final int MAX = 50;
    @Override
    public IFigure BuildFigure() {
        return new Square(
                Color.values()[rand.nextInt(Color.values().length)],
                Main.rand.nextInt(MAX) + MIN
        );
    }
}
