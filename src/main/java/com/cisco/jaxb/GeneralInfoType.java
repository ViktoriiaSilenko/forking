
package com.cisco.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for generalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msgFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="msgTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replyQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalInfoType", namespace = "http://service-it.by/BiometryCallRs", propOrder = {
    "msgId",
    "msgFrom",
    "msgDate",
    "msgTo",
    "replyId",
    "replyQ"
})
public class GeneralInfoType {

    @XmlElement(namespace = "http://service-it.by/BiometryCallRs", required = true)
    protected String msgId;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRs")
    protected String msgFrom;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRs", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgDate;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRs")
    protected String msgTo;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRs")
    protected String replyId;
    @XmlElement(namespace = "http://service-it.by/BiometryCallRs")
    protected String replyQ;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the msgFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgFrom() {
        return msgFrom;
    }

    /**
     * Sets the value of the msgFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgFrom(String value) {
        this.msgFrom = value;
    }

    /**
     * Gets the value of the msgDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMsgDate() {
        return msgDate;
    }

    /**
     * Sets the value of the msgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMsgDate(XMLGregorianCalendar value) {
        this.msgDate = value;
    }

    /**
     * Gets the value of the msgTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgTo() {
        return msgTo;
    }

    /**
     * Sets the value of the msgTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgTo(String value) {
        this.msgTo = value;
    }

    /**
     * Gets the value of the replyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyId() {
        return replyId;
    }

    /**
     * Sets the value of the replyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyId(String value) {
        this.replyId = value;
    }

    /**
     * Gets the value of the replyQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyQ() {
        return replyQ;
    }

    /**
     * Sets the value of the replyQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyQ(String value) {
        this.replyQ = value;
    }

}
