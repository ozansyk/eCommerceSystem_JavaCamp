package eCommerceSystem.business.abstracts;

public interface CheckUserFieldService {
	
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
	boolean checkPassword(String password);
	boolean eMailRegex(String eMail);
	boolean eMailRepeated(String eMail);
	
}
