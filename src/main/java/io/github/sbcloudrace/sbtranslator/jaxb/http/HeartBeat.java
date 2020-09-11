
package io.github.sbcloudrace.sbtranslator.jaxb.http;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeartBeat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeartBeat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetagameFlags" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="enabledBitField" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeartBeat", propOrder = {
    "metagameFlags",
    "enabledBitField"
})
public class HeartBeat {

    @XmlElement(name = "MetagameFlags")
    protected int metagameFlags;
    protected int enabledBitField;

    /**
     * Gets the value of the metagameFlags property.
     * 
     */
    public int getMetagameFlags() {
        return metagameFlags;
    }

    /**
     * Sets the value of the metagameFlags property.
     * 
     */
    public void setMetagameFlags(int value) {
        this.metagameFlags = value;
    }

    /**
     * Gets the value of the enabledBitField property.
     * 
     */
    public int getEnabledBitField() {
        return enabledBitField;
    }

    /**
     * Sets the value of the enabledBitField property.
     * 
     */
    public void setEnabledBitField(int value) {
        this.enabledBitField = value;
    }

}
