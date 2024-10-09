package com.lab02.lab02.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CalculatorTask1{
    private double x;
    private double n;
    private double e;

    public double calculateChByCount(double x, int n){
        double res=1;
        for(int i=0; i<n; i++){
            res+=x/factorial(2+i*2);
        }
        return res;
    }

    public double[] calculateChByDelta(double x, double e){
        double res[]=new double[]{1, 0};
        while(x/factorial((int)(2.0+res[1]*2.0))>e){
            res[0]+=x/factorial((int)(2.0+res[1]*2.0));
            res[1]+=1.0;
        }
        return res;
    }

    private int factorial(int x) {
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
