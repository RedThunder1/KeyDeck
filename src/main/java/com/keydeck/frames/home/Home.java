package com.keydeck.frames.home;

import com.keydeck.KeyDeckMain;

import javax.swing.*;
import java.awt.*;

public class Home {

    public static JFrame frame = KeyDeckMain.frame;

    public static void home() {
        JLabel desc = new JLabel("KeyDeck is software for a custom keybinding device!");
        desc.setForeground(Color.WHITE);
        desc.setFont(new Font("Courier", Font.BOLD,20));
        frame.add(desc);


    }

}
