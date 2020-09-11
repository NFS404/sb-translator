
package io.github.sbcloudrace.sbtranslator.jaxb.http;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarSlotInfoTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarSlotInfoTrans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarsOwnedByPersona" type="{}ArrayOfOwnedCarTrans" minOccurs="0"/>
 *         &lt;element name="DefaultOwnedCarIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ObtainableSlots" type="{}ArrayOfProductTrans" minOccurs="0"/>
 *         &lt;element name="OwnedCarSlotsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarSlotInfoTrans", propOrder = {
    "carsOwnedByPersona",
    "defaultOwnedCarIndex",
    "obtainableSlots",
    "ownedCarSlotsCount"
})
public class CarSlotInfoTrans {

    @XmlElement(name = "CarsOwnedByPersona")
    protected ArrayOfOwnedCarTrans carsOwnedByPersona;
    @XmlElement(name = "DefaultOwnedCarIndex")
    protected int defaultOwnedCarIndex;
    @XmlElement(name = "ObtainableSlots")
    protected ArrayOfProductTrans obtainableSlots;
    @XmlElement(name = "OwnedCarSlotsCount")
    protected int ownedCarSlotsCount;

    /**
     * Gets the value of the carsOwnedByPersona property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOwnedCarTrans }
     *     
     */
    public ArrayOfOwnedCarTrans getCarsOwnedByPersona() {
        return carsOwnedByPersona;
    }

    /**
     * Sets the value of the carsOwnedByPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOwnedCarTrans }
     *     
     */
    public void setCarsOwnedByPersona(ArrayOfOwnedCarTrans value) {
        this.carsOwnedByPersona = value;
    }

    /**
     * Gets the value of the defaultOwnedCarIndex property.
     * 
     */
    public int getDefaultOwnedCarIndex() {
        return defaultOwnedCarIndex;
    }

    /**
     * Sets the value of the defaultOwnedCarIndex property.
     * 
     */
    public void setDefaultOwnedCarIndex(int value) {
        this.defaultOwnedCarIndex = value;
    }

    /**
     * Gets the value of the obtainableSlots property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductTrans }
     *     
     */
    public ArrayOfProductTrans getObtainableSlots() {
        return obtainableSlots;
    }

    /**
     * Sets the value of the obtainableSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductTrans }
     *     
     */
    public void setObtainableSlots(ArrayOfProductTrans value) {
        this.obtainableSlots = value;
    }

    /**
     * Gets the value of the ownedCarSlotsCount property.
     * 
     */
    public int getOwnedCarSlotsCount() {
        return ownedCarSlotsCount;
    }

    /**
     * Sets the value of the ownedCarSlotsCount property.
     * 
     */
    public void setOwnedCarSlotsCount(int value) {
        this.ownedCarSlotsCount = value;
    }

}
