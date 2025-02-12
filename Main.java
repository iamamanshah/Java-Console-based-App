package Assignment;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		input();
	}
	
	public static void input() {
		System.out.println("Welcome to the Climate Action");
		System.out.println("========================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		String id = sc.next();
		System.out.println("Enter Password: ");
		String pw = sc.next();
		if (id.equals("admin") && pw.equals("12345")) {
			admin.adminUI();
		}
		
		else if (id.equals("user") && pw.equals("56789")) {
			user.userUI();
		}	
		else {
			System.out.println("Invalid Username or Password");
			System.out.println("========================");
			System.out.println("========================");
			Main.main(null);
		}
		sc.close();
	}

}
