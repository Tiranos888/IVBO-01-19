package Practise_3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle(){}

    Rectangle(double width, double length){
        this.length=length;
        this.width=width;
    }

    Rectangle(double width, double length,String color,boolean filled){
        super(color,filled);
        this.length=length;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimetr() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle: " + " color=" + color + " filled=" + filled+
                " width=" + width +
                ", length=" + length ;
    }
}
