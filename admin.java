package Assignment;

import java.util.Scanner;
public class admin {

	public static void adminUI(){
		System.out.println("========================");
		System.out.println("==== Welcome Admin ====");
		System.out.println("========================");
		Scanner input = new Scanner(System.in);
		System.out.println("1. Add New Information");
		System.out.println("2. Delete the existing information");
		System.out.println("3. View Information");
		System.out.println("4. Log Out");
		System.out.println("Please select the required field: ");
		int choice = input.nextInt();
		
		if (choice == 1) {
			InformationUI.newinfo();
		}
		else if (choice == 2) {
			delete.delinfo();
		}
		else if (choice == 3) {
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


