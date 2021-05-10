package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.RegisterService;
import eCommerceSystem.entities.abstracts.User;
import eCommerceSystem.entities.concretes.CustomerUser;

public class RegisterManager implements RegisterService {

	@Override
	public boolean register(User user) {
		if(registerControl(user)) {
			System.out.println("Register successfully: " + user.getFirstName());
			return true;
		} else {
			System.out.println("Email or password is wrong!");
			return false;
		}
	}

	@Override
	public boolean logOut(User user) {
		System.out.println("Logout: " + user.getFirstName());
		return true;
	}
	
	public boolean registerControl(User user) {
		for(CustomerUser c : CustomerUser.customerUserList) {
			if(user.geteMail() == c.geteMail() && user.getPassword() == c.getPassword()) {
				return true;
			}
		}
		return false;
	}
	
}
