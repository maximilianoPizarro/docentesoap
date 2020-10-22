
package com.sample.company.employeeservice.getemployeedetailservice.getemployeedetailresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Body complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Body"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeName" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="EmployeeEmail" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Body", propOrder = {
    "employeeName",
    "employeeID",
    "employeeEmail"
})
public class Body {

    @XmlElement(name = "EmployeeName", required = true)
    protected Object employeeName;
    @XmlElement(name = "EmployeeID", required = true)
    protected Object employeeID;
    @XmlElement(name = "EmployeeEmail", required = true)
    protected Object employeeEmail;

    /**
     * Gets the value of the employeeName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmployeeName() {
        return employeeName;
    }

    /**
     * Sets the value of the employeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmployeeName(Object value) {
        this.employeeName = value;
    }

    /**
     * Gets the value of the employeeID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmployeeID(Object value) {
        this.employeeID = value;
    }

    /**
     * Gets the value of the employeeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmployeeEmail() {
        return employeeEmail;
    }

    /**
     * Sets the value of the employeeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmployeeEmail(Object value) {
        this.employeeEmail = value;
    }

}
