package com.ekkon.ftlweaponmaker.gui;

import javax.swing.*;
import java.awt.*;

/**
 * FTL-Weapon-Maker-Java
 * Created by Waseef Nayeem.
 * 2016-09-19
 * File Description
 * WARNING!!! THIS CLASS IS NOT OPTIMIZED!!!
 */
public class MainPanel extends JTabbedPane{

    public boolean running;

    public MainPanel(int w, int h) {
        running = true;
        this.setPreferredSize(new Dimension(w, h));
        this.addTab("Weapon Properties", new WeaponPanel());
        this.addTab("Animation Properties", new WeaponPanel());
    }
}
