# BackEnd_AddressBookService
Here the Goal is to create a simple microservice for searching adrresses with a city name from the text/csv file.
Further extending to searching from Database.

Requirements--
1.The application itself should manage information such as, first name, lastname,  address in detail of users.
2.It should allow consumers of the API to search from these entries filtering records based on city name.

RESTful service - exposes a REST API for searching the users by entering city.
The services is written in Java and use the following technologies.

-Spring Boot
-Java 11
-Maven
-Swagger for API Documentation

Build and Running the service-

To build the project, we are using  Maven.
project- run - build with maven - mvn clean install

After the project has been built, a target directory will be created containing the executable jar.


To build image and run it Launch docker desktop 
Tranverse to 'target' director where jar is located
Run the below commands-- 
	docker build -f Dockerfile -t addressbookdemo .
	docker run -p 8000:8000 addressbookdemo

Application will run on port 8080
 
 
You can use below links to consume the api and to swagger the documentation-
http://localhost:8080/AddressFromCSV/{city}
http://localhost:8080/swagger-resources/
http://localhost:8080/swagger-ui/
http://localhost:8080/v2/api-docs/


