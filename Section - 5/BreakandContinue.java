public class BreakandContinue {
    public static void main(String[] args) 
    {
        for(int i =0;i<10;i++)
        {
            if(i%2 != 0)
            {
                continue;                       //Continue keyword skips the particular iteration of the loop and continues
            }
            System.out.println(i);
        }
        System.out.println("Second loop starts");
        for(int j = 0 ; j < 10 ; j++)
        {
            if (j%2 !=0 ) {
                break;                          //Break keyword terminates the whole loop
            }
            System.out.println(j);
        }
    }
}
