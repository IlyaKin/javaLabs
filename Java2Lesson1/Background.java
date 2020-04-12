package ru.geekbrains.java2.lesson1;

import javax.swing.*;
import java.awt.*;

public class Background extends JPanel{
    float x=0;
    Background() {

    }
    void update (GameCanvas canvas, float deltaTime){
        x=deltaTime*500;
        Color Bg = new Color ((int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255));
        if ((int)x%5==1) {
            setBackground(Bg);
        }}


    void render (GameCanvas canvas, Graphics g){
        g.setColor(getBackground());
        g.fillRect(canvas.getX(),canvas.getY(), canvas.getWidth(), canvas.getHeight());
    }
}




