# BackEnd_AddressBookService
Here the Goal is to create a simple microservice for searching addresses from a directory matching to a city name.  
As per the scanerio the directory is text/csv file.
Planning to further extend the service to search from Database.

Requirements--  
1.The application itself should manage information such as, first name, lastname,  address in detail of users.  

2.It should allow consumers of the API to search from these entries filtering records based on city name.

RESTful service - exposes a REST API for searching the users by entering city.
The services is written in Java and use the following technologies.

-Spring Boot   
-Java 11    
-Maven   
-Swagger for API Documentation      



Build and Running the service--

To build the project, we are using  Maven.  

project- run - build with maven - mvn clean install

After the project has been built, a target directory will be created containing the executable jar.    




To build image and run it-- 

Launch docker desktop     
Tranverse to 'target' directory where jar and Dockerfile is located    
Run the below commands--   

	docker build -f Dockerfile -t addressbookdemo .  
	docker run -p 8000:8000 addressbookdemo

Application will run on port 8080
 
 
You can use below links to consume the api and to swagger the documentation-     

	http://localhost:8080/api/AddressFromCSV/{city}   
	http://localhost:8080/swagger-resources/    
	http://localhost:8080/swagger-ui/    
	http://localhost:8080/v2/api-docs/    



In this microservice the User_Data.txt file is read from resourses folder.   
So we can run the jar directly anywhere and consume the api. File having screenshots for testing the api is also attached.
