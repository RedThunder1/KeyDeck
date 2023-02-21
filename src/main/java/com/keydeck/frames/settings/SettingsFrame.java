package com.keydeck.frames.settings;

import com.keydeck.KeyDeckMain;

import javax.swing.*;
import java.awt.*;

public class SettingsFrame {

    public static JFrame frame = KeyDeckMain.frame;

    public static void settings() {
        JLabel desc = new JLabel("Settings");
        desc.setForeground(Color.WHITE);
        desc.setFont(new Font("Courier", Font.BOLD,20));
        frame.add(desc, BorderLayout.NORTH);

        JLabel TestSlider = new JLabel("test slider");
        desc.setForeground(Color.WHITE);
        desc.setFont(new Font("Courier", Font.BOLD,5));
        frame.add(TestSlider, BorderLayout.WEST);

        JSlider slider = new JSlider();
        slider.setMinimum(0);
        slider.setMaximum(100);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25);
        frame.add(slider, BorderLayout.WEST);


        JPanel applyPanel = new JPanel();
        applyPanel.setBackground(new Color(50,50,50));
        applyPanel.setLayout(new FlowLayout());
        JButton apply = new JButton("Apply");
        apply.setBackground(new Color(64,64,64));
        apply.setOpaque(true);
        apply.setForeground(Color.WHITE);
        applyPanel.add(apply);
        frame.add(applyPanel,BorderLayout.SOUTH);


    }

}
