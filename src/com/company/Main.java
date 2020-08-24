package com.company;

import com.company.game.GamePanel;

import javax.swing.*;

public class Main {

    public Main(){
        JFrame frame = new JFrame();
        GamePanel gamePanel = new GamePanel();

        frame.add(gamePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake");

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }


    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
