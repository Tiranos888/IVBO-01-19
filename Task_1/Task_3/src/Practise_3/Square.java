package Practise_3;

public class Square extends Rectangle {
    Square(){}

    Square(double side){
        this.length=side;
        this.width=side;
    }

    Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return length;
    }

    public void setSide(double side){
        this.length=side;
        this.width=side;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimetr() {
        return super.getPerimetr();
    }

    @Override
    public String toString() {
        return "Rectangle: " + " color=" + color + " filled=" + filled+
                " side=" + width;
    }
}
