package com.keydeck.frames.edit;

import com.keydeck.KeyDeckMain;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GetInput {

    public static String getInput(JFrame frame) {
        String keyBind = "";
        ArrayList<Character> keys = new ArrayList<>();
        frame.removeAll();
        JLabel desc = new JLabel("Setting KeyBind,  Max length is 5 keys!");
        if (KeyDeckMain.darkModeOn) {
            desc.setForeground(Color.WHITE);
        } else {
            desc.setForeground(Color.black);
        }
        desc.setFont(new Font("Courier", Font.BOLD,20));
        frame.add(desc, BorderLayout.NORTH);

        frame.revalidate();
        frame.repaint();

        KeyboardFocusManager keyManager = new DefaultKeyboardFocusManager();
        keyManager.addKeyEventDispatcher(e -> {
            if (keys.contains(e.getKeyChar()) && keys.size() <= 5) {
                keys.add(e.getKeyChar());
            } else if (keys.size() > 5) {
                System.out.println(keys);
                EditBinds.edit();
                return true;
            }
            return false;
        });




        return keyBind;
    }
}
