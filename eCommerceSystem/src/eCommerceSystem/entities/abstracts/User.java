package eCommerceSystem.entities.abstracts;

import eCommerceSystem.business.abstracts.CheckUserFieldService;

public abstract class User implements Entity {
	protected String firstName;
	protected String lastName;
	protected String eMail;
	protected String password;
	protected CheckUserFieldService checkUserFieldService;
	
	public User(CheckUserFieldService checkUserFieldService) {
		this.checkUserFieldService = checkUserFieldService;
		
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

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
