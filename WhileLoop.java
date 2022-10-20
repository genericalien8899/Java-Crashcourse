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

//as the guess is random we cant say this loop will run a particular number of times. Hence while loop is best for this