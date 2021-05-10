package eCommerceSystem;

import java.util.Scanner;

import eCommerceSystem.business.abstracts.RegisterService;
import eCommerceSystem.business.concretes.CheckUserFieldManager;
import eCommerceSystem.business.concretes.RegisterManager;
import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.dataAccess.concretes.HibernateUserDao;
import eCommerceSystem.entities.abstracts.User;
import eCommerceSystem.entities.concretes.CustomerUser;

public class Main {

	public static void main(String[] args) {
		
		User customerUser = new CustomerUser(new CheckUserFieldManager());
		Scanner input = new Scanner(System.in);
		
		System.out.print("L�tfen ad�n�z� giriniz: ");
		String firstName = input.next();
		customerUser.setFirstName(firstName);
		System.out.println("Ad�n�z: " + customerUser.getFirstName());
		
		System.out.print("L�tfen soyad�n�z� giriniz: ");
		String lastName = input.next();
		customerUser.setLastName(lastName);
		System.out.println("Soyad�n�z: " + customerUser.getLastName());
		
		System.out.print("L�tfen �ifrenizi giriniz: ");
		String password = input.next();
		customerUser.setPassword(password);
		System.out.println("�ifreniz: " + customerUser.getPassword());
		
		System.out.print("L�tfen emailiniz giriniz: ");
		String eMail = input.next();
		customerUser.seteMail(eMail);
		System.out.println("Emailiniz: " + customerUser.geteMail());
		
		//When user push "Ok" button, then call the method
		UserDao hibernateUserDao = new HibernateUserDao();
		hibernateUserDao.userAdd(customerUser);
		
		input.close();
		
		System.out.println("--------------");
		
		RegisterService registerManager = new RegisterManager();
		registerManager.register(customerUser);
		
	}

}
