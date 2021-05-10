package eCommerceSystem.Adapters;

import eCommerceSystem.business.abstracts.RegisterService;
import eCommerceSystem.entities.abstracts.User;
import eCommerceSystem.googleService.concretes.GoogleRegisterService;

public class GoogleRegisterManager implements RegisterService {

	@Override
	public boolean register(User user) {
		GoogleRegisterService googleRegisterService = new GoogleRegisterService();
		googleRegisterService.googleRegister(user);
		return true;
	}

	@Override
	public boolean logOut(User user) {
		System.out.println("Logout: " + user.getFirstName());
		return true;
	}
	
}
