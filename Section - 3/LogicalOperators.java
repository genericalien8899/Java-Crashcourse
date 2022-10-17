public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 45;
        int biologyGrade = 15;
        String lang = "java";

        if(chemistryGrade >= 75 || biologyGrade >=75 || lang.equals("java"))
        {
            System.out.println("Congrats, you got the scholarship");
        }
        else
        {
            System.out.println("You didnt get the scholarship");
        }

        int credits = 60;
        double gpa = 4.2;
        if(credits >= 50 && gpa >=3.5)
        {
            System.out.println("Congrats you got your diploma");
        }
        else
        {
            System.out.println("You didnt meet the creteria to get your diploma");
        }
    }
}
