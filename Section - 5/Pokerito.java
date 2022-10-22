public class Pokerito {
    public static void main(String[] args) 
    {
        int cardForUser = CardChooser();
        System.out.println("Here is your card!\n" + cardForUser);
        int cardForComp = CardChooser();
        System.out.println("Here is computer's card\n" + cardForComp);
        int userCount = 0;
        int compCount = 0;
        System.out.println("Now the dealer will draw 5 cards");
        for (int i =0 ; i < 5 ; i++)
        {
            System.out.println("Card "+(i+1));
            int pick = CardChooser();
            System.out.println(pick);
            if(pick==cardForUser)
            {
                userCount++;
            }
            else if(pick == cardForComp)
            {
                compCount++;
            }
        }
        if(userCount == compCount)
        {
            System.out.println("Everybody wins" );
        }
        else if(userCount > compCount)
        {
            System.out.println("Congrats, you have won");
        }
        else
        {
            System.out.println("Computer has won");
        }
        
    }
    public static int CardChooser()
    {
        int generatedNumber = (int)((Math.random()*13)+1);
        return generatedNumber;
    }
}
