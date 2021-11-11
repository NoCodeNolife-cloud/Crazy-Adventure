package com.NoCodeNoLife;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * ProjectName: Crazy-Adventure
 * Name: MainWindow
 * User: Administrator
 * Data: Created in 2021/11/10
 * Description:
 */
public class MainWindow {

    private JButton startButton;
    private JPanel JPanel1;
    private JButton exitButton;

    public MainWindow() {
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
        startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Crazy Adventure");
        frame.setContentPane(new MainWindow().JPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(450, 150);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
