package com.ekkon.ftlweaponmaker;

import com.ekkon.ftlweaponmaker.com.ekkon.ftlweaponmaker.gui.GUIPanel;

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
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(new GUIPanel(800, 600));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
