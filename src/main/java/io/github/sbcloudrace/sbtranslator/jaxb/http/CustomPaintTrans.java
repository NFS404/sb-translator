
package io.github.sbcloudrace.sbtranslator.jaxb.http;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomPaintTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomPaintTrans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Hue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Sat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Slot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Var" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomPaintTrans", propOrder = {
    "group",
    "hue",
    "sat",
    "slot",
    "var"
})
public class CustomPaintTrans {

    @XmlElement(name = "Group")
    protected int group;
    @XmlElement(name = "Hue")
    protected int hue;
    @XmlElement(name = "Sat")
    protected int sat;
    @XmlElement(name = "Slot")
    protected int slot;
    @XmlElement(name = "Var")
    protected int var;

    /**
     * Gets the value of the group property.
     * 
     */
    public int getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     */
    public void setGroup(int value) {
        this.group = value;
    }

    /**
     * Gets the value of the hue property.
     * 
     */
    public int getHue() {
        return hue;
    }

    /**
     * Sets the value of the hue property.
     * 
     */
    public void setHue(int value) {
        this.hue = value;
    }

    /**
     * Gets the value of the sat property.
     * 
     */
    public int getSat() {
        return sat;
    }

    /**
     * Sets the value of the sat property.
     * 
     */
    public void setSat(int value) {
        this.sat = value;
    }

    /**
     * Gets the value of the slot property.
     * 
     */
    public int getSlot() {
        return slot;
    }

    /**
     * Sets the value of the slot property.
     * 
     */
    public void setSlot(int value) {
        this.slot = value;
    }

    /**
     * Gets the value of the var property.
     * 
     */
    public int getVar() {
        return var;
    }

    /**
     * Sets the value of the var property.
     * 
     */
    public void setVar(int value) {
        this.var = value;
    }

}
