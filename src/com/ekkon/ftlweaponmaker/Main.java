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
        frame.setResizable(false);
        frame.add(new MainPanel(800, 628));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
