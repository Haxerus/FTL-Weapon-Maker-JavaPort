package com.ekkon.ftlweaponmaker.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * FTL-Weapon-Maker-Java
 * Created by Waseef Nayeem.
 * 2016-09-19
 * File Description
 * WARNING!!! THIS CLASS IS NOT OPTIMIZED!!!
 */
public class MainPanel extends JTabbedPane{

    public boolean running;

    public BufferedImage bg, logo;

    public MainPanel(int w, int h) {
        try {
            bg = ImageIO.read(this.getClass().getResourceAsStream("/res/background.png"));
            logo = ImageIO.read(this.getClass().getResourceAsStream("/res/logo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        running = true;
        this.setPreferredSize(new Dimension(w, h));
        this.addTab("Weapon Properties", new WeaponPanel(bg, logo));
        this.addTab("Animation Properties", new AnimationPanel(bg, logo));
    }
}
