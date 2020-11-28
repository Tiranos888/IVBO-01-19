package Lab_5;

import javax.swing.*;

public class Anim extends JFrame {

    GIF gif=new GIF();

    public Anim(){
        this.setSize(1920,1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(gif);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Anim animation= new Anim();
    }
}
