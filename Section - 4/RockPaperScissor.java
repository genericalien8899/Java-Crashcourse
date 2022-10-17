import java.util.Locale;
import java.util.Scanner;

public class RockPaperScissor 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Lets play Rock Paper Scissors. \nWhen i say 'shoot' Choose: rock, paper or scissor");
        System.out.println("Are you ready? Write 'yes' if you are");
        String yesOrNo = scan.next();
        if(yesOrNo.equals("yes") || yesOrNo.equals("Yes") )
        {
            System.out.println("Great!\nRock - Paper - Scissors, Shoot!");
            String userRoll = scan.next();
            String uppUserChoice = userRoll.toUpperCase();
            if((uppUserChoice.equals("ROCK"))||(uppUserChoice.equals("PAPER"))||(uppUserChoice.equals("SCISSORS")))
            {
                winner(uppUserChoice,ComputerRoll());
            }
            else{
                System.out.println("You should choose Rock or paper or scissors only. Bye! Come back when you are ready to play");
                System.exit(0);
            }
            
           
        }
        else
        {
            System.out.println("Come again when you want to play");
        }
        scan.close();
        
    }
    public static String ComputerRoll()
    {
        int compChoice = (int)((Math.random()*3)+1);
        switch(compChoice)
        {
            case 1 : System.out.println("Computer chose rock"); 
            return ("Rock");
            case 2 : System.out.println("Computer chose paper");
            return ("Paper");
            case 3 : System.out.println("Computer chose scissors");
            return ("Scissors");
            default : return "";
        }
    }
    public static void winner(String uppUserChoice, String compChoice)
    {   
        if (uppUserChoice.equals("ROCK")  && compChoice.equals("Paper") ||
                (uppUserChoice.equals("PAPER")  && compChoice.equals("Scissors") ) ||
                 (uppUserChoice.equals("SCISSORS")  && compChoice.equals("Rock")))
        {
            System.out.println("You have lost");
        }
        else if (uppUserChoice.equals("ROCK")  && compChoice.equals("Rock") ||
        (uppUserChoice.equals("PAPER")  && compChoice.equals("Paper") ) ||
         (uppUserChoice.equals("SCISSORS")  && compChoice.equals("Scissors")))
        {
            System.out.println("Its a draw");
        }
        else
        {
            System.out.println("You have won");
        }
    }
}
