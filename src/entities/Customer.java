package entities;

import abstracts.Entity;

public class Customer implements Entity {
	private int id;
	private String nationalityId;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	
	public Customer(int id,String nationalityId,String firstName,String lastName,int yearOfBirth)
	{
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
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

	public int getId() {
		return id;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}
}
