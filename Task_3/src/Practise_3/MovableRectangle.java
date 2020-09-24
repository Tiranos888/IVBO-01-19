package Practise_3;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle (int x1,int x2,int y1, int y2,int xSpeed,int ySpeed){
        topLeft=new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight=new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft.toString() +
                ", bottomRight=" + bottomRight.toString() +
                '}';
    }

    public boolean checkSpeed(){
        if (topLeft.getxSpeed()== bottomRight.getxSpeed() & topLeft.getySpeed()== bottomRight.getySpeed()){
            return true;
        } else return false;
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
}
