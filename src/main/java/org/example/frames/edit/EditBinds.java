package org.example.frames.edit;

import org.example.KeyDeckMain;

import javax.swing.*;
import java.awt.*;

public class EditBinds {

    public static JFrame frame = KeyDeckMain.frame;

    public static void edit() {
        JLabel desc = new JLabel("Edit Key Binds");
        desc.setForeground(Color.WHITE);
        desc.setFont(new Font("Courier", Font.BOLD,20));
        frame.add(desc);

    }

}
