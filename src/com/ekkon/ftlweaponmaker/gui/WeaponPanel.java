package com.ekkon.ftlweaponmaker.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * FTL-Weapon-Maker-Java
 * Created by Waseef Nayeem.
 * 2016-09-19
 * File Description
 * WARNING!!! THIS CLASS IS NOT OPTIMIZED!!!
 */
public class WeaponPanel extends JPanel {

    BufferedImage bg, logo;

    JButton createWeapon;

    public WeaponPanel(BufferedImage bg, BufferedImage logo) {
        this.bg = bg;
        this.logo = logo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, this.getWidth(), this.getHeight(), null);
        g.drawImage(logo, this.getWidth()-logo.getWidth(), 0, null);
    }

    private void initGUI() {
        createWeapon = new JButton("New ");
    }
}
