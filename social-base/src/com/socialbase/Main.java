package com.socialbase;

import com.socialbase.gui.SocialBaseGUI;
import javax.swing.UIManager; //Import UI Manager

public class Main {
    public static void main(String[] args) {
        // Set the look and feel (optional)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Launch the GUI
        SocialBaseGUI.main(args);
    }
}