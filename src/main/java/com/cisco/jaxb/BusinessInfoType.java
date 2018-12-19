
package com.cisco.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactCrmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="len" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="speechLen" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="validity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="liveness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessInfoType", namespace = "http://service-it.by/BiometryCallRs", propOrder = {
    "callToken",
    "contactCrmId",
    "len",
    "speechLen",
    "validity",
    "liveness"
})
public class BusinessInfoType {

    @XmlElement(namespace = "http://service-it.by/BiometryCallRs")
    protected String callToken;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRs")
    protected String contactCrmId;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRs")
    protected Float len;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRs")
    protected Float speechLen;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRs")
    protected Float validity;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRs")
    protected Float liveness;

    /**
     * Gets the value of the callToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallToken() {
        return callToken;
    }

    /**
     * Sets the value of the callToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallToken(String value) {
        this.callToken = value;
    }

    /**
     * Gets the value of the contactCrmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactCrmId() {
        return contactCrmId;
    }

    /**
     * Sets the value of the contactCrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactCrmId(String value) {
        this.contactCrmId = value;
    }

    /**
     * Gets the value of the len property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLen() {
        return len;
    }

    /**
     * Sets the value of the len property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLen(Float value) {
        this.len = value;
    }

    /**
     * Gets the value of the speechLen property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpeechLen() {
        return speechLen;
    }

    /**
     * Sets the value of the speechLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeechLen(Float value) {
        this.speechLen = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValidity(Float value) {
        this.validity = value;
    }

    /**
     * Gets the value of the liveness property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLiveness() {
        return liveness;
    }

    /**
     * Sets the value of the liveness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLiveness(Float value) {
        this.liveness = value;
    }

}
