package com.keydeck.frames.edit;

import com.keydeck.KeyDeckMain;
import com.keydeck.frames.settings.SettingsFrame;

import javax.swing.*;
import java.awt.*;

public class EditBinds {

    public static JFrame frame = KeyDeckMain.frame;

    public static void edit() {
        JLabel desc = new JLabel("Edit Key Binds");
        if (KeyDeckMain.darkModeOn) {
            desc.setForeground(Color.WHITE);
        } else {
            desc.setForeground(Color.black);
        }
        desc.setFont(new Font("Courier", Font.BOLD,20));
        frame.add(desc, BorderLayout.NORTH);

        JPanel bindsPanel = new JPanel(new GridLayout(1,9, 10, 10));
        bindsPanel.setBackground(SettingsFrame.getActiveMode()[0]);
        bindsPanel.setLayout(new FlowLayout());

        JButton key1 = new JButton("Key 1");
        key1.setBackground(SettingsFrame.getActiveMode()[2]);
        key1.setBounds(10,20,30,15);
        if (KeyDeckMain.darkModeOn) {
            key1.setForeground(Color.WHITE);
        } else {
            key1.setForeground(Color.black);
        }
        key1.setOpaque(true);

        JButton key2 = new JButton("Key 2");
        key2.setBackground(SettingsFrame.getActiveMode()[2]);
        if (KeyDeckMain.darkModeOn) {
            key2.setForeground(Color.WHITE);
        } else {
            key2.setForeground(Color.black);
        }
        key2.setOpaque(true);

        JButton key3 = new JButton("Key 3");
        key3.setBackground(SettingsFrame.getActiveMode()[2]);
        if (KeyDeckMain.darkModeOn) {
            key3.setForeground(Color.WHITE);
        } else {
            key3.setForeground(Color.black);
        }
        key1.setOpaque(true);

        JButton key4 = new JButton("Key 4");
        key4.setBackground(SettingsFrame.getActiveMode()[2]);
        if (KeyDeckMain.darkModeOn) {
            key4.setForeground(Color.WHITE);
        } else {
            key4.setForeground(Color.black);
        }
        key4.setOpaque(true);

        JButton key5 = new JButton("Key 5");
        key5.setBackground(SettingsFrame.getActiveMode()[2]);
        if (KeyDeckMain.darkModeOn) {
            key5.setForeground(Color.WHITE);
        } else {
            key5.setForeground(Color.black);
        }
        key5.setOpaque(true);

        JButton key6 = new JButton("Key 6");
        key6.setBackground(SettingsFrame.getActiveMode()[2]);
        if (KeyDeckMain.darkModeOn) {
            key6.setForeground(Color.WHITE);
        } else {
            key6.setForeground(Color.black);
        }
        key6.setOpaque(true);

        JButton key7 = new JButton("Key 7");
        key7.setBackground(SettingsFrame.getActiveMode()[2]);
        if (KeyDeckMain.darkModeOn) {
            key7.setForeground(Color.WHITE);
        } else {
            key7.setForeground(Color.black);
        }
        key7.setOpaque(true);

        JButton key8 = new JButton("Key 8");
        key8.setBackground(SettingsFrame.getActiveMode()[2]);
        if (KeyDeckMain.darkModeOn) {
            key8.setForeground(Color.WHITE);
        } else {
            key8.setForeground(Color.black);
        }
        key8.setOpaque(true);

        JButton mode = new JButton("Mode: 1");
        mode.setBackground(SettingsFrame.getActiveMode()[2]);
        if (KeyDeckMain.darkModeOn) {
            mode.setForeground(Color.WHITE);
        } else {
            mode.setForeground(Color.black);
        }
        mode.setOpaque(true);

        bindsPanel.add(key1);
        bindsPanel.add(key2);
        bindsPanel.add(key3);
        bindsPanel.add(key4);
        bindsPanel.add(key5);
        bindsPanel.add(key6);
        bindsPanel.add(key7);
        bindsPanel.add(key8);
        bindsPanel.add(mode);
        frame.add(bindsPanel, BorderLayout.CENTER);

    }

}
