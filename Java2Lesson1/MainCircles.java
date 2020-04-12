package ru.geekbrains.java2.lesson1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;

public class MainCircles extends JFrame {
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    Sprite[] sprites = new Sprite[30];
    Background BC = new Background();
    private static int a = 5;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainCircles();
            }
        });
    }

    private MainCircles() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        GameCanvas canvas = new GameCanvas(this);
        add(canvas, BorderLayout.CENTER);
        setTitle("Circles");
        JButton btnADD = new JButton("Add");
        JButton btnDELETE = new JButton("Delete");
        btnDELETE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a-=1;
                if(a <= 0){
                    System.exit(0);
                }
            }
        });
        btnADD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               a += 1;
               if(a >= sprites.length){
                   System.exit(0);}
            }
        });
        JPanel pBtns = new JPanel(new GridLayout(1,2));
        pBtns.add(btnADD);
        pBtns.add(btnDELETE);
        add(pBtns, BorderLayout.SOUTH);

        initApplication();
        setVisible(true);
    }

    private void initApplication() {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new Ball();
        }
    }

    void onCanvasRepainted(GameCanvas canvas, Graphics g, float deltaTime) {

        update(canvas, deltaTime);
        render(canvas, g);
    }


    private void update(GameCanvas canvas, float deltaTime) {
       BC.update(canvas,deltaTime);
       for (int i = 0; i < a; i++) {
           sprites[i].update(canvas, deltaTime);
        }
    }

    private void render(GameCanvas canvas, Graphics g) {
       BC.render(canvas, g);
          for (int i = 0; i < a; i++) {
            sprites[i].render(canvas, g);
        }
    }
}
