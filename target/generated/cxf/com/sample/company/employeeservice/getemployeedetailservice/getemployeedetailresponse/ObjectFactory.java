
package com.sample.company.employeeservice.getemployeedetailservice.getemployeedetailresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sample.company.employeeservice.getemployeedetailservice.getemployeedetailresponse package. 
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

    private final static QName _GetEmployeeDetailResponse_QNAME = new QName("http://com/sample/company/employeeservice/getemployeedetailservice/GetEmployeeDetailResponse", "GetEmployeeDetailResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sample.company.employeeservice.getemployeedetailservice.getemployeedetailresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeDetailResponse }
     * 
     */
    public GetEmployeeDetailResponse createGetEmployeeDetailResponse() {
        return new GetEmployeeDetailResponse();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeDetailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployeeDetailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://com/sample/company/employeeservice/getemployeedetailservice/GetEmployeeDetailResponse", name = "GetEmployeeDetailResponse")
    public JAXBElement<GetEmployeeDetailResponse> createGetEmployeeDetailResponse(GetEmployeeDetailResponse value) {
        return new JAXBElement<GetEmployeeDetailResponse>(_GetEmployeeDetailResponse_QNAME, GetEmployeeDetailResponse.class, null, value);
    }

}
