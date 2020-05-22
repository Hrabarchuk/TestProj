package com.company;

import com.company.figures.IFigure;
import com.company.figuresBuilder.CircleBuilder;
import com.company.figuresBuilder.IFigureBuilder;
import com.company.figuresBuilder.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static Random rand = new Random();

    public static void main(String[] args) {
        IFigure[]array = new IFigure[(rand.nextInt((20))+1)];

        Map<Integer, IFigureBuilder> fig = new LinkedHashMap<Integer, IFigureBuilder>();
        fig.put(1, new CircleBuilder());
        fig.put(2, new SquareBuilder());
        fig.put(3, new TrapezeBuilder());
        fig.put(4, new TriangleBuilder());

        for(int i = 0; i < array.length; i++) {
            array[i] = fig.get(rand.nextInt(fig.size())+1).BuildFigure();
        }

        for(IFigure i : array) {
            System.out.println(i.draw());
            i.draw();
        }
    }

}
