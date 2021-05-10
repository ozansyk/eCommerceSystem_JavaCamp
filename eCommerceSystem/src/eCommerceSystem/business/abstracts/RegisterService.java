package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.abstracts.User;

public interface RegisterService {
	boolean register(User user);
	boolean logOut(User user);
}
