package com.amit.AddressBook.Service;

import java.util.List;

import com.amit.AddressBook.Entity.AddressBook;

public interface AddressBookCSVService {
	public List<AddressBook> findAllByCityName(String city);
}
