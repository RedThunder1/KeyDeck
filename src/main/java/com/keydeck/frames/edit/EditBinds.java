package com.keydeck.frames.edit;

import com.keydeck.KeyDeckMain;
import com.keydeck.frames.settings.SettingsFrame;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class EditBinds {

    public static JFrame frame = KeyDeckMain.frame;
    public static int modeInt = 1;

    public static HashMap<String, String> keybinds = new HashMap<>();

    public static void edit() {
        JLabel desc = new JLabel("Click the key you want to edit!", SwingConstants.CENTER);
        if (KeyDeckMain.darkModeOn) {
            desc.setForeground(Color.WHITE);
        } else {
            desc.setForeground(Color.black);
        }
        desc.setFont(new Font("Courier", Font.BOLD,20));
        frame.add(desc, BorderLayout.NORTH);

        JPanel bindsPanel = new JPanel(new GridLayout(2,9, 0,20));
        bindsPanel.setBackground(SettingsFrame.getActiveMode()[0]);

        JPanel devPanel = new JPanel();
        devPanel.setLayout(new FlowLayout());
        devPanel.setBackground(SettingsFrame.getActiveMode()[1]);
        JButton outputMap = new JButton("Output Map Contents");
        outputMap.setBackground(SettingsFrame.getActiveMode()[2]);
        outputMap.setBounds(10,20,30,15);
        if (KeyDeckMain.darkModeOn) {
            outputMap.setForeground(Color.WHITE);
        } else {
            outputMap.setForeground(Color.black);
        }
        JLabel devText = new JLabel("Dev Panel");
        if (KeyDeckMain.darkModeOn) {
            devText.setForeground(Color.WHITE);
        } else {
            devText.setForeground(Color.black);
        }
        devPanel.add(devText);
        devPanel.add(outputMap);

        if (KeyDeckMain.devMode) {
            frame.add(devPanel, BorderLayout.SOUTH);
        }


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

        bindsPanel.add(key1);
        bindsPanel.add(key2);
        bindsPanel.add(key3);
        bindsPanel.add(key4);
        bindsPanel.add(key5);
        bindsPanel.add(key6);
        bindsPanel.add(key7);
        bindsPanel.add(key8);
        bindsPanel.add(mode);
        JLabel[] binds = new JLabel[]{new JLabel(keybinds.get("1")), new JLabel(keybinds.get("2")),new JLabel(keybinds.get("3")),new JLabel(keybinds.get("4")),new JLabel(keybinds.get("5")),new JLabel(keybinds.get("6")),new JLabel(keybinds.get("7")),new JLabel(keybinds.get("8"))};
        for (JLabel label : binds) {
            if (KeyDeckMain.darkModeOn) {
                label.setForeground(Color.WHITE);
            } else {
                label.setForeground(Color.black);
            }
            label.setFont(new Font("Courier", Font.BOLD,15));
            bindsPanel.add(label);
        }
        JLabel modeText = new JLabel("Mode: 1");
        if (KeyDeckMain.darkModeOn) {
            modeText.setForeground(Color.WHITE);
        } else {
            modeText.setForeground(Color.black);
        }
        modeText.setFont(new Font("Courier", Font.BOLD,20));
        bindsPanel.add(modeText);
        frame.add(bindsPanel, BorderLayout.CENTER);

        key1.addActionListener(e -> {
            switch (modeInt) {
                case 1 -> keybinds.put("1", GetInput.getInput(frame));
                case 2 -> keybinds.put("9", GetInput.getInput(frame));
                case 3 -> keybinds.put("17", GetInput.getInput(frame));
                default -> {
                    System.out.println("There was an issue with modeInt!");
                    modeText.setText("Mode: 1");
                    modeInt = 1;
                }
            }
        });

        key2.addActionListener(e -> {
            switch (modeInt) {
                case 1 -> keybinds.put("2", GetInput.getInput(frame));
                case 2 -> keybinds.put("10", GetInput.getInput(frame));
                case 3 -> keybinds.put("18", GetInput.getInput(frame));
                default -> {
                    System.out.println("There was an issue with modeInt!");
                    modeText.setText("Mode: 1");
                    modeInt = 1;
                }
            }
        });

        key3.addActionListener(e -> {
            switch (modeInt) {
                case 1 -> keybinds.put("3", GetInput.getInput(frame));
                case 2 -> keybinds.put("11", GetInput.getInput(frame));
                case 3 -> keybinds.put("19", GetInput.getInput(frame));
                default -> {
                    System.out.println("There was an issue with modeInt!");
                    modeText.setText("Mode: 1");
                    modeInt = 1;
                }
            }
        });

        key4.addActionListener(e -> {
            switch (modeInt) {
                case 1 -> keybinds.put("4", GetInput.getInput(frame));
                case 2 -> keybinds.put("12", GetInput.getInput(frame));
                case 3 -> keybinds.put("20", GetInput.getInput(frame));
                default -> {
                    System.out.println("There was an issue with modeInt!");
                    modeText.setText("Mode: 1");
                    modeInt = 1;
                }
            }
        });

        key5.addActionListener(e -> {
            switch (modeInt) {
                case 1 -> keybinds.put("5", GetInput.getInput(frame));
                case 2 -> keybinds.put("13", GetInput.getInput(frame));
                case 3 -> keybinds.put("21", GetInput.getInput(frame));
                default -> {
                    System.out.println("There was an issue with modeInt!");
                    modeText.setText("Mode: 1");
                    modeInt = 1;
                }
            }
        });

        key6.addActionListener(e -> {
            switch (modeInt) {
                case 1 -> keybinds.put("6", GetInput.getInput(frame));
                case 2 -> keybinds.put("14", GetInput.getInput(frame));
                case 3 -> keybinds.put("22", GetInput.getInput(frame));
                default -> {
                    System.out.println("There was an issue with modeInt!");
                    modeText.setText("Mode: 1");
                    modeInt = 1;
                }
            }
        });

        key7.addActionListener(e -> {
            switch (modeInt) {
                case 1 -> keybinds.put("7", GetInput.getInput(frame));
                case 2 -> keybinds.put("15", GetInput.getInput(frame));
                case 3 -> keybinds.put("23", GetInput.getInput(frame));
                default -> {
                    System.out.println("There was an issue with modeInt!");
                    modeText.setText("Mode: 1");
                    modeInt = 1;
                }
            }
        });

        key8.addActionListener(e -> {
            switch (modeInt) {
                case 1 -> keybinds.put("8", GetInput.getInput(frame));
                case 2 -> keybinds.put("16", GetInput.getInput(frame));
                case 3 -> keybinds.put("24", GetInput.getInput(frame));
                default -> {
                    System.out.println("There was an issue with modeInt!");
                    modeText.setText("Mode: 1");
                    modeInt = 1;
                }
            }
        });

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
        });

        outputMap.addActionListener(e -> System.out.println(keybinds));
    }
    public static HashMap<String, String> getKeybinds() {return keybinds;}
}
