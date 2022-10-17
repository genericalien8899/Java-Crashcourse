import java.util.Locale;
import java.util.Scanner;

public class TriviaQuiz {
    public static void main(String[] args) {
        System.out.println("Hi! Welcome to the quiz.Here comes your first question");
        int counter = 0;
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("\n1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy");
        String ans1 = scan.nextLine();

        System.out.println("2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars");
        String ans2 = scan.nextLine();

        System.out.println("3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative");
        String ans3 = scan.nextLine();

        System.out.println("4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy");
        String ans4 = scan.nextLine();
        if(ans1.equals("c"))
        {
            counter+=5;
        }
        if(ans2.equals("a"))
        {
            counter+=5;
        }
        if(ans3.equals("d"))
        {
            counter+=5;
        }
        if(ans4.equals("a") || ans4.equals("b"))
        {
            counter+=5;
        }
        scan.close();
        System.out.println(counter);
        switch(counter){
            case 0:System.out.println("Your final score is "+counter+"/20"+"\nBetter luck next time");break;
            case 5:System.out.println("Your final score is "+counter+"/20"+"\nNot bad");break;
            case 10:System.out.println("Your final score is "+counter+"/20"+"\nNot bad");break;
            case 15:System.out.println("Your final score is "+counter+"/20"+"\nNot bad");break;
            case 20:System.out.println("Your final score is "+counter+"/20"+"\nWow! You know your stuff");break;

        }
    }
}
