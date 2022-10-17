import java.util.Scanner;
import java.util.Locale;
public class Chatbot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Hello, What is your name?");
        String name = scan.nextLine();

        System.out.println("\nHi "+name+ "! I'm Javabot. Where are you from?");
        String place = scan.nextLine();

        System.out.println("\nI heard its beautiful at "+ place+" I'm from a place called Oracle");
        
        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("So,you are "+ age +" ,cool! I'm 400 years old.");
        System.out.println("This means I'm "+(400/age)+" times older than you");
        
        System.out.println("Enough about me. What is your favorite language (just don't say python)");
        scan.nextLine();
        String favLang = scan.nextLine();

        System.out.println(favLang+", fair enough! How many years have you been coding in "+favLang+"?");
        int years = scan.nextInt();

        System.out.println(years+" years eh? That's great keep it up!\nNice chatting with you "+ name +" I have to log off now, BYE!");

        scan.close();
    }
}
