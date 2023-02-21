package org.example.frames.modes;

import org.example.KeyDeckMain;

import javax.swing.*;
import java.awt.*;

public class Modes {

    public static JFrame frame = KeyDeckMain.frame;

    public static void modes() {
        JLabel desc = new JLabel("Modes");
        desc.setForeground(Color.WHITE);
        desc.setFont(new Font("Courier", Font.BOLD,20));
        frame.add(desc);


    }
}
