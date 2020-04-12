package ru.geekbrains.lesson7.online;

import javax.swing.*;
import java.awt.*;

public class FieldPanel extends JPanel {

    private static int cellX;
    private static int cellY;


    public static final int MODE_HVH = 0;
    public static final int MODE_HVAI = 1;
    FieldPanel(){
        setBackground(Color.blue);
    }
    void startNewGame(int gameMode,int fieldSizeX, int fieldSizeY, int winLength){
        System.out.printf("damn mode: %d\nfield size: %d\nwin length: %d\n", gameMode, fieldSizeX, winLength);
       /* JPanel Map = new JPanel(new GridLayout(fieldSizeX, fieldSizeY));
        int[][] cell1 = new int[cellX][cellY];
        for (int cellX = 0; cellX < (507/fieldSizeX) - 5; cellX++){
            for (int cellY = 0; cellY < (507/fieldSizeY) - 5; cellY++){
                add(Map);
                setForeground(Color.black);
                setVisible(true);*/

            }
        }


