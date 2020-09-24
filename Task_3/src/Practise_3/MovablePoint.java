package Practise_3;

public class MovablePoint implements Movable {
    private int x,y,xSpeed,ySpeed;
    MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        x=x+xSpeed;
    }

    @Override
    public void moveDown() {
        x=x-xSpeed;
    }

    @Override
    public void moveLeft() {
        y=y-ySpeed;
    }

    @Override
    public void moveRight() {
        y=y+ySpeed;
    }

    public int getxSpeed(){
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }
}
