package eCommerceSystem.dataAccess.abstracts;

import eCommerceSystem.entities.abstracts.User;

public interface UserDao {
	void userAdd(User user);
	void updateUser(User user);
	void deleteUser(User user);
}
