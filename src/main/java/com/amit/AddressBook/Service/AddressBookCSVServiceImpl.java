package com.amit.AddressBook.Service;

import java.io.FileNotFoundException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.AddressBook.Entity.AddressBook;

import com.amit.AddressBook.Repository.AddressBookCSVRepositoryImpl;

@Service
public class AddressBookCSVServiceImpl {

	@Autowired
	AddressBookCSVRepositoryImpl addressBookCSVRepositoryImpl;

	public List<AddressBook> findAllByCityName(String city) throws FileNotFoundException {

		List<AddressBook> addressList = addressBookCSVRepositoryImpl.findAllByCity(city);
		return addressList;

	}
}
