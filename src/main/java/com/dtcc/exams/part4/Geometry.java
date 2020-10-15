package com.dtcc.exams.part4;

public class Geometry implements Circle,Rectangle{
    int radius;
    int height;
    int width;

    public Geometry(){
        this(0,0,0);
    }

    public Geometry(int height, int width, int radius){
        this.radius = radius;
        this.height = height;
        this.width = width;
    }

    public int getArea(int height, int width){
        return area(height, width);

    }

    public double getArea(int radius){
        return area(radius);

    }

    public double area(int radius){
        return (radius*radius*3.14);
    }

    public int area(int height, int width) {
        return (int)(width * height);
    }
}
