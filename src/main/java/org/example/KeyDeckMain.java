package org.example;

import org.example.frames.edit.EditBinds;
import org.example.frames.home.Home;
import org.example.frames.modes.Modes;
import org.example.frames.settings.SettingsFrame;

import javax.swing.*;
import java.awt.*;


public class KeyDeckMain {
    public static JFrame frame = new JFrame();
    public static String page = "home";


    public static JButton home = new JButton("Home");
    public static JButton mode = new JButton("Mode");
    public static JButton editBinds = new JButton("Edit KeyBinds");
    public static JButton settings = new JButton("Settings");


    public static void main(String[] args) {

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
        frame.getContentPane().setBackground(new Color(64,64,64));
        frame.setLayout(new BorderLayout());
        frame.setSize(1400, 800);
        frame.setResizable(false);

        JMenuBar menu = new JMenuBar();
        menu.setBackground(new Color(60,60,60));
        menu.setOpaque(true);
        frame.setJMenuBar(menu);

        //Home Page
        home.setBackground(new Color(80,80,80));
        home.setForeground(Color.WHITE);
        home.setOpaque(true);
        menu.add(home);


        //Responsible for shifting between modes.
        //There will be multiple modes where each mode has different key binds assigned.
        mode.setBackground(new Color(80,80,80));
        mode.setForeground(Color.WHITE);
        mode.setOpaque(true);
        menu.add(mode);

        //Opens tab responsible for editing key binds
        editBinds.setBackground(new Color(80,80,80));
        editBinds.setForeground(Color.WHITE);
        editBinds.setOpaque(true);
        menu.add(editBinds);

        //Will add settings for the app and other things eventually (I still have to figure out a lot about swing)
        settings.setBackground(new Color(80,80,80));
        settings.setForeground(Color.WHITE);
        settings.setOpaque(true);
        menu.add(settings);

        //Call home class to set home frame
        Home.home();
        frame.setVisible(true);
        home.addActionListener(e -> {
            if (!(page.equals("home"))) {
                frame.getContentPane().removeAll();
                Home.home();
                page = "home";
                frame.revalidate();
                frame.repaint();
            }
        });
        mode.addActionListener(e -> {
            if (!(page.equals("mode"))) {
                frame.getContentPane().removeAll();
                Modes.modes();
                page = "mode";
                frame.revalidate();
                frame.repaint();
            }
        });
        editBinds.addActionListener(e -> {
            if (!(page.equals("edit"))) {
                frame.getContentPane().removeAll();
                EditBinds.edit();
                page = "edit";
                frame.revalidate();
                frame.repaint();
            }
        });
        settings.addActionListener(e -> {
            if (!(page.equals("settings"))) {
                frame.getContentPane().removeAll();
                SettingsFrame.settings();
                page = "settings";
                frame.revalidate();
                frame.repaint();
            }
        });
    }
}