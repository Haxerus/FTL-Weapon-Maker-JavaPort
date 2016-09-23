package com.ekkon.ftlweaponmaker.gui.components;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by 323934851 on 23/09/2016.
 */
public class BetterTextField extends JTextField {

    public BetterTextField() {

    }

    public BetterTextField(String text) {
        super(text);
    }

    public BetterTextField(int columns) {
        super(columns);
    }

    public BetterTextField(String text, int columns) {
        super(text, columns);
    }

    void initListeners() {
        this.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
    }
}
