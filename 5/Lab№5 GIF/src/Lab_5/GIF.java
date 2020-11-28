package Lab_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GIF extends JPanel implements ActionListener {

    int changer=0;
    Timer tm=new Timer(1500,this);
    JLabel label = new JLabel(new ImageIcon("src/Lab_5/AoS_Screen.png"));



    public GIF(){
        label.setSize(1500,800);
        label.setLocation(0,0);
        label.setVisible(true);
        this.setLayout(null);
        this.add(label);
        tm.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(changer){
            case 0: label.setIcon(new ImageIcon("src/Lab_5/AoS_Screen.png"));
                changer++;
                break;
            case 1:
                label.setIcon(new ImageIcon("src/Lab_5/AoS_Screen1.png"));
                changer++;
                break;
            case 2:
                label.setIcon(new ImageIcon("src/Lab_5/AoS_Screen2.png"));
                changer=0;
                break;
        }
    }
}

