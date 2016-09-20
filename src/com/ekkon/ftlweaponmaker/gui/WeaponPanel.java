package com.ekkon.ftlweaponmaker.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * FTL-Weapon-Maker-Java
 * Created by Waseef Nayeem.
 * 2016-09-19
 * File Description
 * WARNING!!! THIS CLASS IS NOT OPTIMIZED!!!
 */
public class WeaponPanel extends JPanel {

    private InputStream input;
    private BufferedImage background;

    WeaponPanel() {
        try {
            input = new BufferedInputStream(new FileInputStream("res/background.png"));
            background = ImageIO.read(input);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Something went wrong while importing files.");
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(background, 0,  0, null);
    }
}
