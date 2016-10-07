package com.ekkon.ftlweaponmaker.xml;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FTL-Weapon-Maker-Java
 * Created by Waseef Nayeem.
 * 2016-09-19
 * File Description
 * WARNING!!! THIS CLASS IS NOT OPTIMIZED!!!
 */
public class Weapon {

    public Document doc;
    public Element weaponBlueprint;

    public Weapon(String name, String type) {
        weaponBlueprint = new Element("weaponBlueprint");
        weaponBlueprint.setAttribute(new Attribute("name", name));
        doc = new Document(weaponBlueprint);

        setType(type);
    }

    public void output() {
        XMLOutputter output = new XMLOutputter();

        output.setFormat(Format.getPrettyFormat());

        try {
            output.output(doc, System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setType(String s) {
        Element type = new Element("type");
        type.setText(s);
        doc.getRootElement().addContent(type);
    }


}
