package com.ekkon.ftlweaponmaker.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
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

    private final JButton button;
    private final JTextField textField;

    public WeaponPanel() {
        button = new JButton("New Weapon...");
        button.setEnabled(false);

        textField = new JTextField(10);
        textField.setText("Weapon Name...");

        this.add(button);
        this.add(textField);

        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateButton();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateButton();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateButton();
            }

            private void updateButton() {
                if (textField.getText().isEmpty()) {
                    button.setEnabled(false);
                } else {
                    button.setEnabled(true);
                }
            }
        });

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField.
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
