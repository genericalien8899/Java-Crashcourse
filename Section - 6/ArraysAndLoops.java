public class ArraysAndLoops{
    public static void main(String[] args) {
        String[] figthers = {"Goku", "Vegeta", "Gohan", "Trunks", "Goten", "Piccolo"};
        System.out.println("The length built-in function gives the length or array or string " + figthers.length);            //length function returns the lenght for the element be it array or string
        for (int i=0;i<figthers.length;i++)  // use for loop to iterate through all the element of an array
        {
             System.out.println("For loop can be used to iterate through elements of array " + figthers[i]);
        }
    }
}