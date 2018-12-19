
package com.cisco.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generalInfo" type="{http://service-it.by/BiometryCallRs}generalInfoType"/>
 *         &lt;element name="errorInfo" type="{http://service-it.by/BiometryCallRs}errorInfoType"/>
 *         &lt;element name="businessInfo" type="{http://service-it.by/BiometryCallRs}businessInfoType" minOccurs="0"/>
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
    "generalInfo",
    "errorInfo",
    "businessInfo"
})
@XmlRootElement(name = "BiometryCallRs", namespace = "http://service-it.by/BiometryCallRs")
public class BiometryCallRs {

    @XmlElement(namespace = "http://service-it.by/BiometryCallRs", required = true)
    protected GeneralInfoType generalInfo;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRs", required = true)
    protected ErrorInfoType errorInfo;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRs")
    protected BusinessInfoType businessInfo;

    /**
     * Gets the value of the generalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInfoType }
     *     
     */
    public GeneralInfoType getGeneralInfo() {
        return generalInfo;
    }

    /**
     * Sets the value of the generalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInfoType }
     *     
     */
    public void setGeneralInfo(GeneralInfoType value) {
        this.generalInfo = value;
    }

    /**
     * Gets the value of the errorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorInfoType }
     *     
     */
    public ErrorInfoType getErrorInfo() {
        return errorInfo;
    }

    /**
     * Sets the value of the errorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorInfoType }
     *     
     */
    public void setErrorInfo(ErrorInfoType value) {
        this.errorInfo = value;
    }

    /**
     * Gets the value of the businessInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInfoType }
     *     
     */
    public BusinessInfoType getBusinessInfo() {
        return businessInfo;
    }

    /**
     * Sets the value of the businessInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInfoType }
     *     
     */
    public void setBusinessInfo(BusinessInfoType value) {
        this.businessInfo = value;
    }

}
