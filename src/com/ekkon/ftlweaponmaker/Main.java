package com.ekkon.ftlweaponmaker;

import com.ekkon.ftlweaponmaker.gui.MainPanel;
import com.ekkon.ftlweaponmaker.xml.Weapon;

import javax.swing.*;

/**
 * FTL-Weapon-Maker-Java
 * Created by Waseef Nayeem.
 * 2016-09-19
 * File Description
 * WARNING!!! THIS CLASS IS NOT OPTIMIZED!!!
 */

public class Main {

    public static JFrame frame = new JFrame("FTL Weapon Maker 2.0");

    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//            System.out.println("Something went wrong while setting L&F");
//        }

        frame.add(new MainPanel(800, 628));
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
