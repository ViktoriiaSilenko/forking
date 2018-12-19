
package com.cisco.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generalInfo",
    "businessInfo"
})
@XmlRootElement(name = "BiometryCallRq", namespace = "http://service-it.by/BiometryCallRq")
public class BiometryCallRq {

    @XmlElement(namespace = "http://service-it.by/BiometryCallRq", required = true)
    protected GeneralInfoType generalInfo;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRq", required = true)
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
