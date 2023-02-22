package com.keydeck.frames.home;

import com.keydeck.KeyDeckMain;

import javax.swing.*;
import java.awt.*;

public class Home {

    public static JFrame frame = KeyDeckMain.frame;

    public static void home() {
        JLabel desc = new JLabel("KeyDeck is software for a custom keybinding device!");
        if (KeyDeckMain.darkModeOn) {
            desc.setForeground(Color.WHITE);
        } else {
            desc.setForeground(Color.black);
        }

        desc.setFont(new Font("Courier", Font.BOLD,20));
        frame.add(desc);


    }

}
