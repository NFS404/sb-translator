
package io.github.sbcloudrace.sbtranslator.jaxb.http;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LobbyEntrantRemoved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LobbyEntrantRemoved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LobbyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PersonaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LobbyEntrantRemoved", propOrder = {
    "lobbyId",
    "personaId"
})
public class LobbyEntrantRemoved {

    @XmlElement(name = "LobbyId")
    protected long lobbyId;
    @XmlElement(name = "PersonaId")
    protected long personaId;

    /**
     * Gets the value of the lobbyId property.
     * 
     */
    public long getLobbyId() {
        return lobbyId;
    }

    /**
     * Sets the value of the lobbyId property.
     * 
     */
    public void setLobbyId(long value) {
        this.lobbyId = value;
    }

    /**
     * Gets the value of the personaId property.
     * 
     */
    public long getPersonaId() {
        return personaId;
    }

    /**
     * Sets the value of the personaId property.
     * 
     */
    public void setPersonaId(long value) {
        this.personaId = value;
    }

}
