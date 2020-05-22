package com.company.figuresBuilder;

import com.company.figures.IFigure;

import java.util.Random;

public interface IFigureBuilder {
    static Random rand = new Random();

    IFigure BuildFigure();
}
