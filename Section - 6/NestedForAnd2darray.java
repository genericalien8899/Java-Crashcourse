public class NestedForAnd2darray {
    public static void main(String[] args) {
        int[][] grades = {{70,71,75,77},{69,70,71,70},{80,85,90,92}};
        for(int i =0;i<3;i++)
        {
            switch(i)
            { 
                case 0 : System.out.print("\tHarry : ");break;
                case 1 : System.out.print("\tRon : ");break;
                case 2 : System.out.print("\tHermione : ");break;
            }
            for(int j =0;j<4;j++)
            {
                System.out.print(grades[i][j]+" ");
            }
            System.out.println();
        }
    }
}
