package ru.gb.jtwo.chat.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor extends JFrame {
    private ClientGUI clientGUI;
    private static final int Width = 300;
    private static final int Height = 150;

   // private final JTextArea login = new JTextArea();
    private final JTextField username = new JTextField();
    private final JTextField password = new JTextField();
    private final JButton btnOk = new JButton("Ok");
    private final JButton btnCancel = new JButton("Cancel");

    Editor(ClientGUI clientGUI){
        this.clientGUI = clientGUI;
        Rectangle clientGUIBounds = clientGUI.getBounds();
        int posX = (int) clientGUIBounds.getCenterX() - Width / 2;
        int posY = (int) clientGUIBounds.getCenterY() - Height / 2;
        setLocation(posX,posY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Width, Height);
        setTitle("Editor");
        setAlwaysOnTop(true);
        setLayout(new GridLayout(3,1));
        add(new JLabel("Enter username"));
        add(username);
        add(new JLabel("Enter password"));
        add(password);
        add(btnOk);
        add(btnCancel);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

    }

}
