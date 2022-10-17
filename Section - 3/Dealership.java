import java.util.Locale;
import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("\nWelcome to the Java Dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();
        switch(option){
            case "a" : System.out.println("You chose option 'a' ");
            System.out.println("Please enter the budget of your purchase");
            int budget = scan.nextInt();
            if (budget >= 10000)
            {
                System.out.println("Great! Nissian ultima is available");
                System.out.println("\nDo you have insurance write 'yes' or 'no'");  
                String insurance = scan.next();
                System.out.println("\nDo you have License write 'yes' or 'no' ");
                String license = scan.next();
                System.out.println("\nWhat is your credit score?");
                int creditScore = scan.nextInt();
                if (insurance.equals("yes") && license.equals("yes") && creditScore > 660)
                {
                    System.out.println("Sold, Pleasure doing business with you");
                } 
                else
                {
                    System.out.println("We're sorry you are not eligible");
                }
            }
            else
            {
                System.out.println("Sorry we dont sell cars under 10 grand");
            }
            
            break;
            case "b" : System.out.println("You chose option 'b' ");
            System.out.println("What is your car valued at?");
            int value = scan.nextInt();
            System.out.println("What is your selling price?");
            int price = scan.nextInt();
            if((price < value) && price <30000){
                System.out.println("We will buy your car. Pleasure doing business with you");
            }
            break;
            default : System.out.println("Please enter a valid option");
        }
        scan.close();
    }
}
