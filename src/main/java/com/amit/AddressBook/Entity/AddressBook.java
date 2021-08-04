package com.amit.AddressBook.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description = "Details about the Address Book")
public class AddressBook {

	@Id
	@Column(name = "firstname")
	@ApiModelProperty(notes = "First Name of user")
	private String firstName;

	@Column(name = "lastname")
	@ApiModelProperty(notes = "Last Name of user")
	private String lastName;

	@Column(name = "street")
	@ApiModelProperty(notes = "Street Name of user address")
	private String street;

	@Column(name = "city")
	@ApiModelProperty(notes = "City Name of user address")
	private String city;

	@Column(name = "state")
	@ApiModelProperty(notes = "State  Name of user address")
	private String state;

	@Column(name = "pincode")
	@ApiModelProperty(notes = "Pincode of user address")
	private String pincode;

	public AddressBook() {

	}

	public AddressBook(String firstName, String lastName, String street, String city, String state, String pincode) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
