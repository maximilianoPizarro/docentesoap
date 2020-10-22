# Sample project for writing SOAP service with Apache Camel, Springboot and Apache CXF

Once you start the application, you can access the services with urls below.

http://localhost:12576/services/. --> This will list all the services in the application.
http://localhost:12576/services/EmployeeDetailService/GetEmployeeDetail?wsdl --> This will display the wsdl for GetEmployeeDetail service which you can import in your SOAP UI


1. build

mvn clean install -DskipTests

2. run

java -jar target/EmployeeWebServices-0.0.1-SNAPSHOT.jar