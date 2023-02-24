package com.keydeck.frames.home;

import com.keydeck.KeyDeckMain;
import com.keydeck.frames.edit.EditBinds;
import com.keydeck.frames.settings.SettingsFrame;
import com.keydeck.inputs.Detectinputs;
import javafx.scene.input.KeyCode;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Home {

    public static JFrame frame = KeyDeckMain.frame;
    public static int modeInt = 1;

    public static void home() {
        JLabel desc = new JLabel("KeyDeck is software for a custom keybinding device!", SwingConstants.CENTER);
        if (KeyDeckMain.darkModeOn) {
            desc.setForeground(Color.WHITE);
        } else {
            desc.setForeground(Color.black);
        }

        desc.setFont(new Font("Courier", Font.BOLD,20));
        frame.add(desc, BorderLayout.CENTER);

        JPanel bindsPanel = new JPanel(new GridLayout(2,9, 0,20));
        bindsPanel.setBackground(SettingsFrame.getActiveMode()[0]);

        JButton key1 = new JButton("Key 1");
        key1.setBackground(SettingsFrame.getActiveMode()[2]);
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
        key3.setOpaque(true);

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

        JButton mode = new JButton("Mode");
        mode.setBackground(SettingsFrame.getActiveMode()[2]);
        if (KeyDeckMain.darkModeOn) {
            mode.setForeground(Color.WHITE);
        } else {
            mode.setForeground(Color.black);
        }
        mode.setOpaque(true);
        frame.add(bindsPanel, BorderLayout.CENTER);
        JLabel modeText = new JLabel("Mode: 1");
        if (KeyDeckMain.darkModeOn) {
            modeText.setForeground(Color.WHITE);
        } else {
            modeText.setForeground(Color.black);
        }
        modeText.setFont(new Font("Courier", Font.BOLD,20));
        JButton[] buttons = new JButton[]{key1,key2,key3,key4,key5,key6,key7,key8,mode};
        for (JButton button : buttons) {
            bindsPanel.add(button);
        }
        HashMap<String, String> keybinds = EditBinds.keybinds;
        JLabel[] mBinds1 = new JLabel[]{new JLabel(keybinds.get("1")), new JLabel(keybinds.get("2")),new JLabel(keybinds.get("3")),new JLabel(keybinds.get("4")),new JLabel(keybinds.get("5")),new JLabel(keybinds.get("6")),new JLabel(keybinds.get("7")),new JLabel(keybinds.get("8")),modeText};
        JLabel[] mBinds2 = new JLabel[]{new JLabel(keybinds.get("9")), new JLabel(keybinds.get("10")),new JLabel(keybinds.get("11")),new JLabel(keybinds.get("12")),new JLabel(keybinds.get("13")),new JLabel(keybinds.get("14")),new JLabel(keybinds.get("15")),new JLabel(keybinds.get("16")),modeText};
        JLabel[] mBinds3 = new JLabel[]{new JLabel(keybinds.get("17")), new JLabel(keybinds.get("18")),new JLabel(keybinds.get("19")),new JLabel(keybinds.get("20")),new JLabel(keybinds.get("21")),new JLabel(keybinds.get("22")),new JLabel(keybinds.get("23")),new JLabel(keybinds.get("24")),modeText};
        for (JLabel label : mBinds1) {
            if (KeyDeckMain.darkModeOn) {
                label.setForeground(Color.WHITE);
            } else {
                label.setForeground(Color.black);
            }
            label.setFont(new Font("Courier", Font.BOLD,15));
            bindsPanel.add(label);
        }

        bindsPanel.add(modeText);
        frame.add(bindsPanel);

        mode.addActionListener(e -> {
            if (modeInt == 1) {
                modeText.setText("Mode: 2");
                modeInt = 2;
            } else if (modeInt == 2) {
                modeText.setText("Mode: 3");
                modeInt = 3;
            } else {
                modeText.setText("Mode: 1");
                modeInt = 1;
            }
            switch (modeInt) {
                case 1 -> {
                    System.out.println("Setting mode 1 keybind text!");
                    bindsPanel.removeAll();
                    for (JButton button : buttons) {
                        bindsPanel.add(button);
                    }
                    for (JLabel text : mBinds1) {
                        bindsPanel.add(text);
                    }
                }
                case 2 -> {
                    System.out.println("Setting mode 2 keybind text!");
                    bindsPanel.removeAll();
                    for (JButton button : buttons) {
                        bindsPanel.add(button);
                    }
                    for (JLabel text : mBinds2) {
                        bindsPanel.add(text);
                    }
                }
                case 3 -> {
                    System.out.println("Setting mode 3 keybind text!");
                    bindsPanel.removeAll();
                    for (JButton button : buttons) {
                        bindsPanel.add(button);
                    }
                    for (JLabel text : mBinds3) {
                        bindsPanel.add(text);
                    }
                }
                default -> {
                    System.out.println("There was an error with modeInt! mode will be set to 1.");
                    modeInt = 1;
                    mode.setText("Mode: 1");
                }
            }
            frame.revalidate();
            frame.repaint();
        });
        key1.addActionListener(e -> {
            try {
                new Robot().keyPress(KeyCode.S.getCode());
            } catch (AWTException ex) {
                throw new RuntimeException(ex);
            }
        });
        key2.addActionListener(e -> Detectinputs.keyPress("2"));
        key3.addActionListener(e -> Detectinputs.keyPress("3"));
        key4.addActionListener(e -> Detectinputs.keyPress("4"));
        key5.addActionListener(e -> Detectinputs.keyPress("5"));
        key6.addActionListener(e -> Detectinputs.keyPress("6"));
        key7.addActionListener(e -> Detectinputs.keyPress("7"));
        key8.addActionListener(e -> Detectinputs.keyPress("8"));

    }
}
