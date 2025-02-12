package Assignment;

import java.util.Scanner;
public class user {

	public static void userUI(){
		System.out.println("========================");
		System.out.println("===== Welcome User =====");
		System.out.println("========================");
		Scanner inp = new Scanner(System.in);
		System.out.println("1. View Information");
		System.out.println("2. Log Out");
		System.out.println("Please select the required field: ");
		int choice = inp.nextInt();
		
		if (choice == 1) {
			 output.displayInformation(InformationUI.getInformationList());
		}
		else {
			System.out.println("========================");
			System.out.println("Thank You for Using the Application.");
			System.out.println("========================");
	        System.out.println("========================");
			Main.main(null);
		}
	}
	
		

}


