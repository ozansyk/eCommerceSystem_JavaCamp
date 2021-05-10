package eCommerceSystem.googleService.concretes;

import eCommerceSystem.entities.abstracts.User;

public class GoogleRegisterService {
	public void googleRegister(User user) {
		System.out.println("Registered with google account: " + user.getFirstName());
	}
}
