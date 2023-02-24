package com.keydeck;

import com.keydeck.frames.edit.EditBinds;
import com.keydeck.frames.home.Home;
import com.keydeck.frames.modes.Modes;
import com.keydeck.frames.settings.SettingsFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.util.Properties;

public class KeyDeckMain {
    public static JFrame frame = new JFrame();
    public static String page = "home";


    public static JButton home = new JButton("Home");
    public static JButton mode = new JButton("Mode");
    public static JButton editBinds = new JButton("Edit KeyBinds");
    public static JButton settings = new JButton("Settings");

    public static boolean darkModeOn = true;
    public static boolean devMode = false;
    public static boolean canChange = true;

    public static Properties properties = new Properties();

    public static void main(String[] args) {
        try {
            //Loads saved properties
            properties.load(new FileInputStream("KeyDeck.properties"));
            System.out.println("Properties loaded!");
        } catch (Exception e) {
            //Catches if there is no saved properties.  This can be the case if its being started for the first time or the properties were deleted / improperly saved.
            System.out.println("Unable to find properties file.  Settings will be set to default.");
            properties.put("theme", "darkMode");
            e.printStackTrace();
        }

        if (properties.get("devMode") != null && properties.get("devMode").equals("true")) {
            devMode = true;
        }

        //Process properties here and load them
        if (properties.get("theme") != null && properties.get("theme").equals("darkMode")) {
            darkModeOn = true;
            SettingsFrame.setActiveMode(SettingsFrame.getDarkMode());
        } else {
            darkModeOn = false;
            SettingsFrame.setActiveMode(SettingsFrame.getLightMode());
        }

        //Loads keybinds.
        for (int i = 0; i < 24; i++) {
            if (properties.get(String.valueOf(i)) != null) {
                EditBinds.getKeybinds().put(String.valueOf(i), (String) properties.get(String.valueOf(i)));
            }
        }

        try {
            //Different look and feels
            //javax.swing.plaf.basic.BasicLookAndFeel
            //javax.swing.plaf.synth.SynthLookAndFeel
            //javax.swing.plaf.metal.MetalLookAndFeel
            //javax.swing.plaf.nimbus.NimbusLookAndFeel
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(SettingsFrame.getActiveMode()[0]);
        frame.setLayout(new BorderLayout());
        frame.setSize(1400, 800);
        frame.setResizable(false);

        JMenuBar menu = new JMenuBar();
        menu.setBackground(SettingsFrame.getActiveMode()[1]);
        menu.setLayout(new FlowLayout());
        menu.setOpaque(true);
        frame.setJMenuBar(menu);

        //Home Page
        home.setBackground(SettingsFrame.getActiveMode()[2]);
        if (darkModeOn) {
            home.setForeground(Color.WHITE);
        } else {
            home.setForeground(Color.black);
        }
        home.setOpaque(true);
        menu.add(home);


        //Responsible for shifting between modes.
        //There will be multiple modes where each mode has different key binds assigned.
        mode.setBackground(SettingsFrame.getActiveMode()[2]);
        if (darkModeOn) {
            mode.setForeground(Color.WHITE);
        } else {
            mode.setForeground(Color.black);
        }
        mode.setOpaque(true);
        menu.add(mode);

        //Opens tab responsible for editing key binds
        editBinds.setBackground(SettingsFrame.getActiveMode()[2]);
        if (darkModeOn) {
            editBinds.setForeground(Color.WHITE);
        } else {
            editBinds.setForeground(Color.black);
        }
        editBinds.setOpaque(true);
        menu.add(editBinds);

        //Will add settings for the app and other things eventually (I still have to figure out a lot about swing)
        settings.setBackground(SettingsFrame.getActiveMode()[2]);
        if (darkModeOn) {
            settings.setForeground(Color.WHITE);
        } else {
            settings.setForeground(Color.black);
        }        settings.setOpaque(true);
        menu.add(settings);

        //Call home class to set home frame
        new Home();
        frame.setVisible(true);
        home.addActionListener(e -> {
            if (!(page.equals("home")) && canChange) {
                frame.getContentPane().removeAll();
                new Home();
                page = "home";
                frame.revalidate();
                frame.repaint();
            }
        });
        mode.addActionListener(e -> {
            if (!(page.equals("mode")) && canChange) {
                frame.getContentPane().removeAll();
                Modes.modes();
                page = "mode";
                frame.revalidate();
                frame.repaint();
            }
        });
        editBinds.addActionListener(e -> {
            if (!(page.equals("edit")) && canChange) {
                frame.getContentPane().removeAll();
                EditBinds.edit();
                page = "edit";
                frame.revalidate();
                frame.repaint();
            }
        });
        settings.addActionListener(e -> {
            if (!(page.equals("settings")) && canChange) {
                frame.getContentPane().removeAll();
                SettingsFrame.settings();
                page = "settings";
                frame.revalidate();
                frame.repaint();
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new OnExit();
            }
        });
    }
}