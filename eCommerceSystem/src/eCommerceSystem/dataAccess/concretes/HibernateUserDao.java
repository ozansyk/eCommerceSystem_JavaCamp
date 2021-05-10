package eCommerceSystem.dataAccess.concretes;

import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.abstracts.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void userAdd(User user) {
		System.out.println("User added to db: " + user.getFirstName());
	}

	@Override
	public void updateUser(User user) {
		System.out.println("User updated on db: " + user.getFirstName());
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("User deleted from db: " + user.getFirstName());
		
	}
	
}
