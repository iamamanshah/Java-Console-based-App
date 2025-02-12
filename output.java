package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class output {
	
    public static void displayInformation(ArrayList<ClimateInfo> informationList) {
    	
        if (informationList == null || informationList.isEmpty()) {
            System.out.println("No information available.");
        } 
        else {
            System.out.println("Displaying Information:");
            for (ClimateInfo info : informationList) {
            	
            	System.out.println("========================");
                System.out.println("Policies of Climate Change: " + info.policies());
                System.out.println("Strategies to eradicate Climate Change: " + info.strategies());
                System.out.println("Planning to eradicate Climate Change: " + info.planning());
                
            }
        }   
        
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("========================");
        System.out.println("Press 1 to Log Out");
        int logout = sc.nextInt();
       
         if (logout == 2) {
        	  System.out.println("Thank You for Using the Application.");
        	  System.out.println("========================");
              System.out.println("========================");
        	  Main.main(null);
          }
        
          
        System.out.println("========================");
        System.out.println("========================");  
    }

	
}
