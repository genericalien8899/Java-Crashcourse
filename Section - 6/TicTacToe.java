public class TicTacToe {
    public static void main(String[] args) 
    {
        char[][] board = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
        print2DArray(board);
        String x;
        String O;
        for (int i = 0 ; i < 9; i ++)
        {
            if(i%2==0)
            {
                askuser(x);
            }
        }

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
    public static void askuser(String choice)
    {
        System.out.println("Turn "+ choice);
        System.out.print("Pick a row and column");
        ``


        print2DArray(null);
    }
}
