public class BuiltInFunctions {
    public static void main(String[] args) {
        System.out.println("Hello Java"); // println is a builtin function hover over println for more info
        // Other examples log , sin , cos
        System.out.println( Math.log(3.14)); // public double log (double x)
        System.out.println(Math.pow(8, 8));// public double pow (double a, double b)

        //math.random returns a number from 0 to 1, multiply it with 100 to get a random number between 0 to 100
        double randomNumber = Math.random() * 100;
        System.out.println((int)randomNumber);
    }
}
