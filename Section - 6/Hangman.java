import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"}; //64

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mysteryWord = randomWord();
        char[] checkArray = mysteryWord.toCharArray();
        System.out.println(Arrays.toString(checkArray));
        System.out.print("Word : ");
        char[] hiddenDash = new char[mysteryWord.length()];
        for(int i = 0 ; i < mysteryWord.length() ; i++)
        {
            hiddenDash[i] = '_';
            System.out.print("_ ");
        }
        System.out.println();
        char[] mistakeArray = new char[6];
        int counter = 0;
        while(counter<6)
        {
            System.out.print("Guess : ");
            char userguess = scan.next().charAt(0);
            for (int i = 0 ; i < mysteryWord.length();i++){
                int populateNumber = checkGuess(checkArray,hiddenDash,userguess);
                if(populateNumber != -1)
                {
                    hiddenDash[populateNumber] = checkArray[populateNumber];
                    System.out.println("Mistakes: "+Arrays.toString(mistakeArray));
                    break;
                }
                else
                {
                    mistakeArray[counter] = userguess;
                    counter++;
                    System.out.println("Mistakes: "+Arrays.toString(mistakeArray));
                    break;
                }
            }
            System.out.print("Word : ");
            for(int j =0; j < hiddenDash.length; j++){
                System.out.print(hiddenDash[j]+" ");
            }
            System.out.println();
            if(Arrays.equals(hiddenDash, checkArray)){
                System.out.println("Congrats you have won");
                break;
            }
        }
        
        scan.close();
    }
    public static String randomWord()
    {
        Random random = new Random();
        String mysteryWord = words[random.nextInt(64)];
        return(mysteryWord);
    }
    public static int checkGuess(char[] checkArray, char[] hiddenDash, char userguess)
    {
        int checkCount = 0;
        for (int i = 0; i<checkArray.length ; i ++)
        {
            if(userguess == checkArray[i] && userguess != hiddenDash[i])
            {
                return i;
            }   
        }
        checkCount++;
        if(checkCount == checkArray.length)
        {
            return -1;
        }
        return -1;
    }

}





