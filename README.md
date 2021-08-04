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

Model(s)--
public class AddressBook { 
      
          private String firstname;
          private String lastname;
          private String street;
          private String city;
          private String state;
          private String pincode;
}

Running the service-

