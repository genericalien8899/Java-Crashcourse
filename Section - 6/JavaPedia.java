import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class JavaPedia {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("How many historical figures you will register ?");
        int numberOfEntries = scan.nextInt();
        scan.nextLine();
        String[][] entries = new String[numberOfEntries][3];
        for (int i = 0; i < numberOfEntries ; i++)
        {
            System.out.println("Figure "+(i+1));
            System.out.print("\tName : ");
            entries[i][0] = scan.nextLine();
            System.out.print("\tDate of Birth : ");
            entries[i][1] = scan.next();
            scan.nextLine();
            System.out.print("\tOccupation : ");
            entries[i][2] = scan.nextLine();
        }
        System.out.println("These are the values you stored");


        for(int i = 0;i<numberOfEntries;i++)
        {
            System.out.println(Arrays.toString(entries[i]));  
        }

        System.out.println("Who do you want information on?");
        String search = scan.next();
        for (int i = 0 ; i < numberOfEntries ; i++)
        {
            if (entries[i][0].equals(search))
            {
                System.out.println("Name : " + entries[i][0]);
                System.out.println("Date of Birth : " + entries[i][1]);
                System.out.println("Occupation : " + entries[i][2]);
                break;
            }
        }
        scan.close();
    }
}
