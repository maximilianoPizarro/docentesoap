
package com.sample.company.employeeservice.getemployeedetailservice.getemployeedetailrequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sample.company.employeeservice.getemployeedetailservice.getemployeedetailrequest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEmployeeDetailRequest_QNAME = new QName("http://com/sample/company/employeeservice/getemployeedetailservice/GetEmployeeDetailRequest", "GetEmployeeDetailRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sample.company.employeeservice.getemployeedetailservice.getemployeedetailrequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeDetailRequest }
     * 
     */
    public GetEmployeeDetailRequest createGetEmployeeDetailRequest() {
        return new GetEmployeeDetailRequest();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeDetailRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployeeDetailRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://com/sample/company/employeeservice/getemployeedetailservice/GetEmployeeDetailRequest", name = "GetEmployeeDetailRequest")
    public JAXBElement<GetEmployeeDetailRequest> createGetEmployeeDetailRequest(GetEmployeeDetailRequest value) {
        return new JAXBElement<GetEmployeeDetailRequest>(_GetEmployeeDetailRequest_QNAME, GetEmployeeDetailRequest.class, null, value);
    }

}
