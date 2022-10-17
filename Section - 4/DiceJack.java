import java.util.Locale;
import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        System.out.println("Rolling the dice");
        int randomRollSum = diceRoll();
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
        System.out.println("Please enter three numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        int usersum = num1+num2+num3;
        System.out.println("usersum = "+usersum);

        System.out.println("Boolean = " + checkWinorLose(usersum, randomRollSum));
        if(checkWinorLose(randomRollSum , usersum)){
            System.out.println("Hurray, you have won the game");
        }
        else{
            System.out.println("Better luck next tieme");
        }
        
        scan.close();

    }
    public static int diceRoll(){
        int i = 0;
        int randomRollSum = 0;
        while(i < 3)
        {
        double randomRoll = (Math.random() * 6) + 1; 
        System.out.println((int)randomRoll);
        i++;
        randomRollSum = randomRollSum + (int)randomRoll;
        System.out.println("Random roll sum = " + randomRollSum);
        }
    return randomRollSum;
    }

    public static boolean checkWinorLose(int dicenum, int usernum){
        return (dicenum <= usernum && (usernum - dicenum)<3);
    }
}
