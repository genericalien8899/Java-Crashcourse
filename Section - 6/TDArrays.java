import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
        //int[][] grades = new int[3][4];
        // grades[0][0] = 70;
        // grades[0][1] = 71;
        // grades[0][2] = 78;
        // grades[0][3] = 75;
        // grades[1][0] = 77;
        // grades[1][1] = 71;
        // grades[1][2] = 73;
        // grades[1][3] = 73;
        // grades[2][0] = 76;
        // grades[2][1] = 77;
        // grades[2][2] = 78;
        // grades[2][3] = 79;
        int[][] grades = {{70,71,72,73},{75,78,70,70},{80,81,82,85}};
        System.out.println(Arrays.toString(grades[0]));
        System.out.println(Arrays.toString(grades[1]));
        System.out.println(Arrays.toString(grades[2]));
        System.out.println("Indivial elements can be accessed by pointing to the particular row and column\n" + grades[0][0]+" "+grades[0][1]+" "+grades[0][2]+" "+grades[0][3]);
    }
}
