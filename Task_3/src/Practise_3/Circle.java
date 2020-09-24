package Practise_3;

public class Circle extends Shape{
    protected double radius;

    Circle(){}

    Circle(double radius){
        this.radius=radius;
    }

    Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (radius*radius*3.14);
    }

    @Override
    public double getPerimetr() {
        return (2*3.14*radius);
    }

    @Override
    public String toString() {
        return "Circle:" + " color=" + color + " filled=" + filled+
                " radius=" + radius;
    }
}
