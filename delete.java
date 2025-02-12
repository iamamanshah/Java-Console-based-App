package Assignment;

import java.util.Scanner;

public class delete {
    public static void delinfo() {
        System.out.println("========================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you sure you want to delete all data? (y/n)");
        String del = sc.nextLine();
        if(del.equalsIgnoreCase("y")) {
            deleteAllInformation();
        }
        sc.close();
    }

    private static void deleteAllInformation() {
        InformationUI.getInformationList().clear();
        System.out.println("Data Delete Successful.");
        System.out.println("========================");
        Scanner sc = new Scanner(System.in);  
        System.out.println("Press 1 to Log Out"); 
        int logout = sc.nextInt();
          if (logout == 1) {
        	  System.out.println("Thank You for Using the Application.");
        	  System.out.println("========================");
              System.out.println("========================");
        	  Main.main(null);
          }

    }
    
}