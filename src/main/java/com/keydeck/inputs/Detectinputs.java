package com.keydeck.inputs;

import com.keydeck.KeyDeckMain;
import javafx.scene.input.KeyCode;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Detectinputs {
    public static Robot r;
    //Here is where it will detect inputs from the keypad and then do the corresponding key bind


    //Functions to execute keybinds
    public static void keyPress(String key) {
        try {
            r = new Robot();
        } catch (Exception e) {
            System.out.println("There was an error with initializing Robot!");
            e.printStackTrace();
        }
        //Get Keybind
        String bind = KeyDeckMain.properties.getProperty(key);
        List<String> keyBind = new ArrayList<>(List.of());
        if (bind != null) {
            for (int i = 0; i < bind.length(); i++) {
                if (bind.charAt(i) == '-') {
                    keyBind.add(bind.substring(0,i));
                    bind = bind.substring(i,bind.length());
                    i = 0;
                }
            }
            for (String s : keyBind) {
                r.keyPress(KeyCode.getKeyCode(s).getCode());
                System.out.println("pressing keybind!");
            }
        }
    }
}
