package com.amit.AddressBook.Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.amit.AddressBook.Entity.AddressBook;

@Repository
/* Repository class containing read logic */
public class AddressBookCSVRepositoryImpl {

	public List<AddressBook> findAllByCity(String city) throws FileNotFoundException {
		
		
        
        
		/* Code to read file from device */
		String line = "";
		String searchAddress = city;

		ArrayList<AddressBook> list1 = new ArrayList<AddressBook>();
		File file = ResourceUtils.getFile("classpath:User_Data.txt"); 
		/*Here file getting read from resources folder*/
		BufferedReader br = new BufferedReader(new FileReader(file));
		try {
			while ((line = br.readLine()) != null) {
				/* Removing the special operators from line */
				line = line.replace("\"", "");
				line = line.replace("“", "");
				String[] sarray = line.split(",");
				if (sarray[3].equalsIgnoreCase(searchAddress)) {
					// Setting data from file to to addressbook object
					AddressBook ad = new AddressBook();
					ad.setFirstName(sarray[0]);
					ad.setLastName(sarray[1]);
					ad.setStreet(sarray[2]);
					ad.setCity(sarray[3]);
					ad.setState(sarray[4]);
					ad.setPincode(sarray[5]);
					// Adding the addressbook object to list
					list1.add(ad);

				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list1;
	}
}
