
package com.smartcity.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="handleRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "handleRequest"
})
@XmlRootElement(name = "handleRequestResponse")
public class HandleRequestResponse {

    protected boolean handleRequest;

    /**
     * Obtient la valeur de la propriété handleRequest.
     * 
     */
    public boolean isHandleRequest() {
        return handleRequest;
    }

    /**
     * Définit la valeur de la propriété handleRequest.
     * 
     */
    public void setHandleRequest(boolean value) {
        this.handleRequest = value;
    }

}
