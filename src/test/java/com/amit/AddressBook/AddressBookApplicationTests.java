package com.amit.AddressBook;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.amit.AddressBook.Entity.AddressBook;
import com.amit.AddressBook.Repository.AddressBookCSVRepositoryImpl;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AddressBookApplicationTests {

	@Autowired
	AddressBookCSVRepositoryImpl addressBookCSVRepositoryImpl;

	@Test
	/*Test for checking address count is not zero*/
	public void givenCity_ThenReturn_AddressOfThatUserInCity_NOTNull() throws FileNotFoundException {

		String city = "Atlanta";
		List<AddressBook> addressList = addressBookCSVRepositoryImpl.findAllByCity(city);
		assertThat(addressList).isNotNull();
	}

	@Test
	/*Test for checking address of user in detail*/
	public void givenCity_ThenShouldReturn_AddressOfThatUserInCity() throws FileNotFoundException {

		AddressBook ad = new AddressBook();
		ad.setFirstName("Dave");
		ad.setLastName("Smith");
		ad.setStreet("123 main st.");
		ad.setCity("seattle");
		ad.setState("wa");
		ad.setPincode("43");

		String city = "Seattle";
		List<AddressBook> addressList = addressBookCSVRepositoryImpl.findAllByCity(city);

		assertEquals(ad.getFirstName(), addressList.get(0).getFirstName());
		assertEquals(ad.getLastName(), addressList.get(0).getLastName());
		assertEquals(ad.getStreet(), addressList.get(0).getStreet());
		assertEquals(ad.getCity(), addressList.get(0).getCity());
		assertEquals(ad.getState(), addressList.get(0).getState());
		assertEquals(ad.getPincode(), addressList.get(0).getPincode());

	}

	@Test
	/*Test for checking city of all returned users*/
	public void givenCity_ThernReturnAddress_CheckCity() throws FileNotFoundException {

		String city = "Atlanta";
		List<AddressBook> addressList = addressBookCSVRepositoryImpl.findAllByCity(city);
		assertThat(addressList).isNotNull();
		for (int i = 0; i < addressList.size(); i++)
			assertEquals(city, addressList.get(i).getCity());
	}
}
