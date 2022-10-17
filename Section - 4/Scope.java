public class Scope {
    static int dogs = 5; 
    public static void main(String[] args) {
        // int dogs = 5; incase of dogs variable declared under main function the someFunction wont return its value
        // incase dogs declared under someFunction(), main() wont print dogs value
        System.out.println(dogs);
        someFunction();
    }
    public static void someFunction(){
        System.out.println(dogs);
    }
}
