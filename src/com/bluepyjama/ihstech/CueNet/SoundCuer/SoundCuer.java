/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluepyjama.ihstech.CueNet.SoundCuer;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

/**
 *
 * @author buckbanzai
 */
public class SoundCuer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (Exception ex) {
            Logger.getLogger(SoundCuer.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFrame frame = new JFrame("SoundCuer");
        frame.add(new MainWindow());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
