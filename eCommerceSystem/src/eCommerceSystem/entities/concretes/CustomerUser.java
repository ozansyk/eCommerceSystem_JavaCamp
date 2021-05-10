package eCommerceSystem.entities.concretes;

import java.util.Scanner;

import eCommerceSystem.business.abstracts.CheckUserFieldService;
import eCommerceSystem.entities.abstracts.User;
import java.util.ArrayList;

public class CustomerUser extends User {
	
	Scanner scanner;
	public static ArrayList<CustomerUser> customerUserList = new ArrayList<CustomerUser>();

	public CustomerUser(CheckUserFieldService checkUserFieldService) {
		super(checkUserFieldService);
		scanner = new Scanner(System.in);
		customerUserList.add(this);
	}
	
	@Override
	public void setFirstName(String firstName) {
		while(checkUserFieldService.checkFirstName(firstName) == false) {
			System.out.print("Ýsim en az 2 harfli olmalý. Lütfen tekrar giriniz: ");
			firstName = scanner.next();
		} 
		this.firstName = firstName;
	}
	
	@Override
	public void setLastName(String lastName) {
		while(checkUserFieldService.checkFirstName(lastName) == false) {
			System.out.print("Soyisim en az 2 harfli olmalý. Lütfen tekrar giriniz: ");
			lastName = scanner.next();
		} 
		this.lastName = lastName;
	}
	
	@Override
	public void setPassword(String password) {
		while(checkUserFieldService.checkPassword(password) == false) {
			System.out.print("Þifre en az 6 karakter olmalý. Lütfen tekrar giriniz: ");
			password = scanner.next();
		} 
		this.password = password;
	}
	
	@Override
	public void seteMail(String eMail) {
		while ((checkUserFieldService.eMailRegex(eMail) || checkUserFieldService.eMailRepeated(eMail)) == false ) {
			System.out.print("Email, email formatýnda olmalý. Lütfen tekrar giriniz: ");
			eMail = scanner.next();
		}
		this.eMail = eMail;
	}
	
}
