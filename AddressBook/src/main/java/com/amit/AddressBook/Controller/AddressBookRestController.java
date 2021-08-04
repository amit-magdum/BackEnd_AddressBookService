package com.amit.AddressBook.Controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.AddressBook.Entity.AddressBook;
import com.amit.AddressBook.Service.AddressBookCSVServiceImpl;

import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping("/api")
/* Controller class responsible for handling all requests */
public class AddressBookRestController {

	@Autowired
	AddressBookCSVServiceImpl addressBookCSVServiceImpl;

	@GetMapping(path = "/AddressFromCSV/{city}")
	@ApiOperation(value = "Find Contacts by City", notes = "Provide a city to search related contacts from Seattle,Tacoma, Florida, Atlanta ", response = AddressBook.class)
	public List<AddressBook> getRecordsFromCSV(@PathVariable String city) throws IOException {

		List<AddressBook> addressList = addressBookCSVServiceImpl.findAllByCityName(city);
		return addressList;

	}

}
