import java.util.Locale;
import java.util.Scanner;
public class Survery {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Welcome, Thank you for taking the survey");
        

        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeFreq = scan.nextInt();
        counter++;

        System.out.println("\nHow much money do you spend on fast-food?");
        double fastfoodPrice = scan.nextDouble();
        counter++;
         
        System.out.println("\nHow many times a week do you buy fastfood?");
        int fastfoodFreq = scan.nextInt();
        counter++;
         
        System.out.println("\nThank you "+name+" for answering all "+counter+" questions!");
        System.out.println("\nYour food expenses are "+(int)(fastfoodPrice / coffeePrice)+" times your coffee expense");
        System.out.println("\nWeekly, you spend "+(coffeePrice*coffeeFreq)+" on coffee");
        System.out.println("\nWeekly, you spend "+(fastfoodPrice*fastfoodFreq)+" on fastfood");


        scan.close();
    }
}
