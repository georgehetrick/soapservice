# SoapService

This is a simple HelloWorld application written as a soap service.

It consists of
1. A java @WebService file
2. a pom file with
   - wsgen    -- to create a wsdl file
   - wsimport -- to create client classes in the target directory
3. a test of the generated client in integration-test
4. use of maven-surefire-plugin to invoke the above test in the
   integration-test phase