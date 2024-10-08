package com.lab02.lab02.model;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class CalculatorTask2 {
    private double start;
    private double finish;
    private double step;

    public List<Point> getPoints(){
        List<Point> points = new ArrayList<>();
        int n = (int) Math.round((finish-start)/step+2);
        for(int i=0; i<n-1; i++){
            double x = start+step*i;
            double y = function(x);
            points.add(new Point(x, y));
        }
        return points;
    }

    private double function(double x){
        return Math.log(Math.abs(2*x))/(Math.sin(x)-Math.PI);
    }
}
