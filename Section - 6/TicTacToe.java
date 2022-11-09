import java.util.Locale;
import java.util.Scanner;

public class TicTacToe 
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) 
    {   
        
        char[][] board = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
        print2DArray(board);
        for (int i = 0 ; i < 9; i ++)
        {
            if(i%2==0)
            {
                System.out.println("Turn : x ");
                int[] spot = askuser(board);
                board[spot[0]][spot[1]] = 'x' ;
            }
            else
            {
                System.out.println("Turn : O ");
                int[] spot = askuser(board);
                board[spot[0]][spot[1]] = 'o' ;
            }
            print2DArray(board);
        }
        scan.close();
    }
    public static void print2DArray(char[][] board)
    {
        System.out.println();
        for (int i = 0 ; i < board.length ; i++)
        {   System.out.println('\t');
            for (int j = 0 ; j < board[i].length ; j++)
            {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[] askuser(char[][] board)
    {
        System.out.print("\tPick a row and column number ");
        int row = scan.nextInt();
        int element = scan.nextInt();
        return new int[] {row,element};
    }
    
}
