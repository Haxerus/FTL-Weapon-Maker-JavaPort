package com.ekkon.ftlweaponmaker.xml;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

import java.io.IOException;

/**
 * FTL-Weapon-Maker-Java
 * Created by Waseef Nayeem.
 * 2016-09-19
 * File Description
 * WARNING!!! THIS CLASS IS NOT OPTIMIZED!!!
 */
public class Weapon {

    Weapon() {

        Element weaponBluprint = new Element("weaponBlueprint");
        Document doc = new Document(weaponBluprint);

        Element meme = new Element("meme");
        meme.setAttribute(new Attribute("type", "the nutshack"));

        doc.getRootElement().addContent(meme);

        XMLOutputter

    }

}
