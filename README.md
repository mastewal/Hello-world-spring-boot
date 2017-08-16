# HelloSpring
- This program creates a simple RESTFUL API using Spring Boot framework. 
The app responds with a JSON text "Hello, World" and a greeting id. 
The id increments every time a request is sent and received.
- Before running this application locally make sure that:
	* Java and Maven are installed on your computer. 
	* The required maven dependencies are included. Refer the pom.xml file about the dependencies.

- Inorder to run the application locally, type:
 "mvn spring-boot:run" from the root project directory (don't include the quotation marks).
- Open a web browser at localhost:8080 and you should see the an output that looks like:
{"id":3,"content":"Hello, World!"}

- You can refer https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#getting-started-first-application 
on how to set up your system and run a spring boot application
