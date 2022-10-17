import java.util.Locale;
import java.util.Scanner;

public class Delimiter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Enter two intergers (on the same line)");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter two big intergers(on the same line)");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();

        System.out.println("Enter two decimals(on the same line)");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();

        System.out.println("Enter two Strings(on the same line)");
        String string1 = scan.next();
        String string2 = scan.next();

        scan.close();

        System.out.println("\n\nThe two integers are :"+num1+" "+num2);
        System.out.println("The two big integers are :"+bigNum1+" "+bigNum2);
        System.out.println("The two decimals are :"+decimal1+" "+decimal2);
        System.out.println("The two strings are :"+string1+" "+string2);
    }
}

//use throw away nextline after nextInt or nextDouble or nextlong to avoid nextline trap

// Example :

// scan.nextInt();
//scan.nextLine();

//Input: 4

//  4 
//  |  |__________________________________________________________________________________________________________________|                   
//   -> this 4 gets read by nextInt as it uses delimiter      |
//                                                            |
//                                                             --> this gets read by nextLine as is doesnt use the demiliter and 
//                                                                               as nextLine reads the whole line and take as 
//                                                                                            one input