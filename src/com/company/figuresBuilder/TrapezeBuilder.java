package com.company.figuresBuilder;

import com.company.figures.Trapeze;
import com.company.figuresBuilder.Color;
import com.company.Main;
import com.company.figures.Circle;
import com.company.figures.IFigure;

public class TrapezeBuilder implements IFigureBuilder {
    final int MIN = 5;
    final int MAX = 50;
    @Override
    public IFigure BuildFigure() {
        int base1 = Main.rand.nextInt(MAX) + MIN;
        int base2 = Main.rand.nextInt(MAX) + MIN;
        int h = Main.rand.nextInt(MAX) + MIN;


        return new Trapeze(
                Color.values()[rand.nextInt(Color.values().length)],
                base1, base2, h
        );
    }
}