public class WhileLoop{
    public static void main(String[] args) {
        double choice = 0.01;
        double guess = 0.99;
        while(choice<guess){
            guess = Math.random();
            System.out.println(guess);
        }
    }
}