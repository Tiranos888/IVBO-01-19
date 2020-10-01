package Pract_4;

import Lab_5.Anim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MatchResults extends JFrame {
    JPanel[] board=new JPanel[6];
    int MilanScore=0,MadridScore=0;
    JButton button1=new JButton("Real Madrid");
    JButton button2=new JButton("AC Milan");
    JLabel label1=new JLabel("Results:"+MilanScore+"/"+MadridScore);
    JLabel label2=new JLabel("Last Scorer:N/A");
    Label label=new Label("Winner:");


    public MatchResults(){
        super("Match Results");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,3));

        for (int i=0;i< board.length;i++){
            board[i]=new JPanel();
            add(board[i]);
        }

        board[2].add(button1);
        board[0].add(button2);
        board[1].add(label1);
        board[3].add(label2);
        board[5].add(label);

        button2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MilanScore++;
                label1.setText("Results:"+MilanScore+"/"+MadridScore);
                label2.setText("Last Scorer: AC Milan");
                if(MilanScore>MadridScore){
                    label.setText("Winner: AC Milan");
                } else {
                    label.setText("Winner: Real Madrid");
                }
                if(MilanScore==MadridScore){
                    label.setText("Winner: DRAW");
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

        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MadridScore++;
                label1.setText("Results:"+MilanScore+"/"+MadridScore);
                label2.setText("Last Scorer: Real Madrid");
                if(MilanScore>MadridScore){
                    label.setText("Winner: AC Milan");
                } else {
                    label.setText("Winner: Real Madrid");
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

        setSize(500,500);
    }

    public static void main(String[] args) {
        new MatchResults().setVisible(true);
    }
}
