package com.keydeck;

import com.keydeck.frames.edit.EditBinds;

import java.io.FileOutputStream;

import static com.keydeck.KeyDeckMain.properties;

public class OnExit {
    public OnExit() {
        //Save all of the keybinds and settings
        System.out.println("Saving properties!");
        try {
            properties.putAll(EditBinds.getKeybinds());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            properties.store(new FileOutputStream("KeyDeck.properties"), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
