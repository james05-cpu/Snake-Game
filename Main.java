 package pck;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[]args){
        JFrame obj= new JFrame();
JMenuBar menuBar=new JMenuBar();
JMenu level=new JMenu("Option");
        JMenuItem hard=new JMenuItem("Launch Snake");
        level.add(hard);
        JMenuItem about=new JMenuItem("About");
        level.add(about);
        JMenuItem exit=new JMenuItem("Exit");
        level.add(exit);
        menuBar.add(level);
obj.setJMenuBar(menuBar);
hard.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      new GameFrame();
    }
});
exit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      System.exit(0);
    }
});
about.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(null,"Snake game \n by james muthiani");
    }
});
        obj.setBounds(50,50,400,400);
        //obj.setFocusable(false);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
}
