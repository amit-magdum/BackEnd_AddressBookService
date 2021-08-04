package com.amit.AddressBook.Repository;


import java.util.List;

import com.amit.AddressBook.Entity.AddressBook;

public interface AddressBookCSVRepository {
	
	public List<AddressBook> findAllByCity(String city);
}
