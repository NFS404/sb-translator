
package io.github.sbcloudrace.sbtranslator.jaxb.http;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChallengeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityResponse", propOrder = {
    "challengeId",
    "result"
})
public class SecurityResponse {

    @XmlElement(name = "ChallengeId")
    protected String challengeId;
    @XmlElement(name = "Result")
    protected long result;

    /**
     * Gets the value of the challengeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeId() {
        return challengeId;
    }

    /**
     * Sets the value of the challengeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeId(String value) {
        this.challengeId = value;
    }

    /**
     * Gets the value of the result property.
     * 
     */
    public long getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    public void setResult(long value) {
        this.result = value;
    }

}
