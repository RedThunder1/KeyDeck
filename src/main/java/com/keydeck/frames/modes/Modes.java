package com.keydeck.frames.modes;

import com.keydeck.KeyDeckMain;

import javax.swing.*;
import java.awt.*;

public class Modes {

    public static JFrame frame = KeyDeckMain.frame;

    public static void modes() {
        JLabel desc = new JLabel("Modes");
        if (KeyDeckMain.darkModeOn) {
            desc.setForeground(Color.WHITE);
        } else {
            desc.setForeground(Color.black);
        }
        desc.setFont(new Font("Courier", Font.BOLD,20));
        frame.add(desc);


    }
}
