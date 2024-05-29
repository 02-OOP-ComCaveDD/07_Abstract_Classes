package com.cc.java;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // return Math.PI * radius * radius;  // Variante 1
        return Math.PI * Math.pow(radius,2);
        
    }




}
