/* In tutorial shown in ReturnValue file */

public class ActionBasedOnParam {
    public static void main(String[] args) 
    {
       System.out.println(measureOfRectangle(-1, 5.5, "perimeter"));
    }
    public static double measureOfRectangle (double len, double wid, String option)
    {
        if (len < 0 || wid < 0) {
            System.out.println("Length or width cannot be negative");
            System.exit(0);
        }
        
        switch(option)
        {
            case "area": return (len * wid);
            case "perimeter" : return (2*(len+wid));
            default : return 404;
        }
        
    }
}
