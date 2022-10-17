import java.util.Locale;
import java.util.Scanner;

public class ReturnValues {
    public static void main(String[] args) {
        System.out.println("Please enter the total bill amount");
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double tips = scan.nextDouble();
        scan.close();
        System.out.println("Amount to be given to waiters is " + tipWaiter(tips));
    }
    public static double tipWaiter (double tips){
        return (tips * 0.15);
    }
}
