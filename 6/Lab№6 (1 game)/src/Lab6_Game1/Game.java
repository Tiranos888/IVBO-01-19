package Lab6_Game1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Game extends JFrame {

    Random rng=new Random();
    JPanel[] panel= new JPanel[4];
    JButton button=new JButton("CHECK");
    JTextField text=new JTextField("write here");
    JLabel label1=new JLabel("Choose");
    JLabel label2=new JLabel("Write your answer below");
    int guess= rng.nextInt(21);
    int lives=3;

    public Game(){
        setSize(400,200);
        setLayout(new GridLayout(2,2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i=0;i< panel.length;i++){
            panel[i]=new JPanel();
            add(panel[i]);
            panel[i].setBackground(Color.getHSBColor(200,200,200));
        }
        panel[2].add(button);
        panel[3].add(text);
        panel[0].add(label1);
        panel[1].add(label2);


        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(lives!=0 && guess!=Integer.valueOf(text.getText())){
                    if (lives==0){
                        setVisible(false);
                    }
                    lives--;
                    label1.setText("Wrong!");
                    if (guess>Integer.valueOf(text.getText())){
                        label2.setText(Integer.valueOf(text.getText())+" is to low");
                    } else {
                        label2.setText(Integer.valueOf(text.getText())+" is to high");
                    }
                }

                if(lives!=0 && guess==Integer.valueOf(text.getText())){
                    label1.setText("You win!");
                    label2.setText("Right");
                    lives=0;
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new Game().setVisible(true);
    }

}
