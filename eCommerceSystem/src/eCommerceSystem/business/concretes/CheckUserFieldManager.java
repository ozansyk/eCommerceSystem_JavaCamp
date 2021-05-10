package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.CheckUserFieldService;
import eCommerceSystem.entities.concretes.CustomerUser;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CheckUserFieldManager implements CheckUserFieldService {

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length() < 2 ) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length() < 2 ) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean checkPassword(String password) {
		if(password.length() < 6 ) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean eMailRegex(String eMail) {
		Pattern expressions =  Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = expressions.matcher(eMail);
		return matcher.find();
	}

	@Override
	public boolean eMailRepeated(String eMail) {
		for(CustomerUser e: CustomerUser.customerUserList) {
			if(e.geteMail() == eMail) {
				return false;
			}
		}
		return true;
	}
	
}
