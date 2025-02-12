package Assignment;
import java.util.ArrayList;
import java.util.Scanner;

public class InformationUI {
    private static ArrayList<ClimateInfo> informationList = new ArrayList<>();

    public static void newinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================");
        System.out.println("- Enter the policies of climate change: ");
        String policiesofclimatechange = sc.nextLine();
        System.out.println("- Enter the stratigies to eradicate climate change: ");
        String strategiesofclimatechange = sc.nextLine();
        System.out.println("- Enter your plans to eradicate climate change: ");
        String planningofclimatechange = sc.nextLine();
        System.out.println("========================");

        ClimateInfo info = new ClimateInfo(policiesofclimatechange, strategiesofclimatechange, planningofclimatechange);
        informationList.add(info);

        System.out.println("Do you want to add more information? (1. Yes || 2. No)");
        int choice = sc.nextInt();
        if (choice == 1) {
            newinfo();
        } else {
            System.out.println("========================");
            System.out.println("Information added successfully.");
            System.out.println("========================");
            Main.main(null);
        }
    }


    public static ArrayList<ClimateInfo> getInformationList() {
        return informationList;
    }


	
}

class ClimateInfo {
    private String policiesofclimatechange;
    private String strategiesofclimatechange;
    private String planningofclimatechange;

    public ClimateInfo(String policiesofclimatechange, String strategiesofclimatechange, String planningofclimatechange) {
        this.policiesofclimatechange = policiesofclimatechange;
        this.strategiesofclimatechange = strategiesofclimatechange;
        this.planningofclimatechange = planningofclimatechange;
    }

    public String policies() {
        return policiesofclimatechange;
    }

    public String strategies() {
        return strategiesofclimatechange;
    }

    public String planning() {
        return planningofclimatechange;
    }
}

class CCInformation {
    private String policiesofclimatechange;
    private String strategiesofclimatechange;
    private String planningofclimatechange;

    public CCInformation(String policiesofclimatechange, String strategiesofclimatechange, String planningofclimatechange) {
        this.policiesofclimatechange = policiesofclimatechange;
        this.strategiesofclimatechange = strategiesofclimatechange;
        this.planningofclimatechange = planningofclimatechange;
    }

    public String policies() {
        return policiesofclimatechange;
    }

    public String strategies() {
        return strategiesofclimatechange;
    }

    public String planning() {
        return planningofclimatechange;
    }
    
}


