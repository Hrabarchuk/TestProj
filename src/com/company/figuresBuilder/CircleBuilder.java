package com.company.figuresBuilder;

import com.company.figuresBuilder.Color;
import com.company.Main;
import com.company.figures.Circle;
import com.company.figures.IFigure;

public class CircleBuilder implements IFigureBuilder {
    final int MIN = 5;
    final int MAX = 80;
    @Override
    public IFigure BuildFigure() {
        return new Circle(Color.values()[rand.nextInt(Color.values().length)]
                ,
                Main.rand.nextInt(MAX) + MIN 
        );
    }
}
