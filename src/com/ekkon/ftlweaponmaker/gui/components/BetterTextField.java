package com.ekkon.ftlweaponmaker.gui.components;

import com.ekkon.ftlweaponmaker.gui.WeaponPanel;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by 323934851 on 23/09/2016.
 */
public class BetterTextField extends JTextField {

    public String placeholder;
    public boolean hasText;

    public BetterTextField() {
        initListeners();
    }

    public BetterTextField(String text) {
        super(text);
        placeholder = text;
        initListeners();
    }

    public BetterTextField(int columns) {
        super(columns);
        initListeners();
    }

    public BetterTextField(String text, int columns) {
        super(text, columns);
        placeholder = text;
        initListeners();
    }

    void initListeners() {
        this.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                hasText = hasText();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                hasText = hasText();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                hasText = hasText();
            }

            private boolean hasText() {
                if (getText().isEmpty()) {
                    return false;
                }
                 return true;
            }
        });

        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (!hasText) {
                    setText(placeholder);
                }
            }
        });
    }
}
