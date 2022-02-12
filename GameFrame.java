package pck;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GameFrame extends JFrame {
    GameFrame(){
        add(new GamePanel());
        setLocation(100,0);
        setTitle("SNAKE");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
    }
}
