package com.keydeck.frames.settings;

import com.keydeck.KeyDeckMain;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class SettingsFrame {
    //Unsure what settings will be in here quite yet but once I develop more of the app I will know
    //0 is dark mode,
    public static List<Boolean> changes = Arrays.asList(false, false);
    public static JFrame frame = KeyDeckMain.frame;
    protected static Color[] darkMode = new Color[]{new Color(64,64,64), new Color(60,60,60), new Color(80,80,80), new Color(50,50,50)};
    //Color variables                                       Background color            Menu color                            Button color              Alternate color
    protected static Color[] lightMode = new Color[]{new Color(255, 255, 255), new Color(206, 206, 206), new Color(190, 190, 190), new Color(192, 192, 192)};
    protected static Color[] activeMode = darkMode;
    private static final Properties properties = KeyDeckMain.properties;

    public static void settings() {
        JLabel desc = new JLabel("Settings");
        if (KeyDeckMain.darkModeOn) {
            desc.setForeground(Color.WHITE);
        } else {
            desc.setForeground(Color.black);
        }
        desc.setFont(new Font("Courier", Font.BOLD,20));
        frame.add(desc, BorderLayout.NORTH);

        JPanel applyPanel = new JPanel();
        applyPanel.setBackground(activeMode[3]);
        applyPanel.setLayout(new FlowLayout());
        JButton apply = new JButton("Apply");
        apply.setBackground(activeMode[0]);
        apply.setOpaque(true);
        apply.setEnabled(false);
        if (KeyDeckMain.darkModeOn) {
            apply.setForeground(Color.WHITE);
        } else {
            apply.setForeground(Color.black);
        }
        applyPanel.add(apply);
        frame.add(applyPanel,BorderLayout.SOUTH);

        JPanel settingsPanel = new JPanel();
        settingsPanel.setBackground(activeMode[0]);
        settingsPanel.setLayout(new SpringLayout());
        JToggleButton darkModeButton = new JToggleButton("Dark Mode");
        darkModeButton.setBackground(activeMode[2]);
        darkModeButton.setOpaque(true);
        if (KeyDeckMain.darkModeOn) {
            darkModeButton.setForeground(Color.WHITE);
        } else {
            darkModeButton.setForeground(Color.BLACK);
        }
        if (KeyDeckMain.darkModeOn) {
            darkModeButton.setEnabled(true);
        }
        settingsPanel.add(darkModeButton);
        darkModeButton.addActionListener(e -> {
            if (!(changes.get(0))) {
                changes.set(0, true);
                apply.setEnabled(true);
            }

        });
        frame.add(settingsPanel, BorderLayout.CENTER);

        apply.addActionListener(e -> {
            if (changes.contains(true)) {
                if (changes.get(0).equals(true)) {
                    if (KeyDeckMain.darkModeOn) {
                        KeyDeckMain.darkModeOn = false;
                        properties.put("theme","lightMode");
                        activeMode = lightMode;
                    } else {
                        KeyDeckMain.darkModeOn = true;
                        properties.put("theme","darkMode");
                        activeMode = darkMode;
                    }
                    frame.revalidate();
                    frame.repaint();
                }
            }
        });

    }

    public static Color[] getDarkMode() {return darkMode;}
    public static Color[] getLightMode() {return lightMode;}
    public static Color[] getActiveMode() {return activeMode;}
    public static void setActiveMode(Color[] color) {activeMode = color;}
}
