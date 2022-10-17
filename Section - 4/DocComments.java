public class DocComments {
    public static void main(String[] args) {
        greet();
    }
/**
 * Function name : greet
 * 
 * Inside the function :
 *  prints: "Hi"
 */
    public static void greet() 
    {
        System.out.println("Hi");
    }

    /**
     * Function name : printName
     * @param name (String)
     * @param age (String)
     * Inside the function : 
     *  Prints name and age as a part of text   
     */
    public static void printName(String name, String age) 
    {
        System.out.println("Hi, My name is "+name+ " and my age is"+age);
    }
}

/* Type /** and press enter java creates comment section to document the function */
