public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3 ; i++){
            System.out.println("'i' iteration" + i);
            for (int j = 0;j < 3 ;j++){
                System.out.println("j : " + j);                              // i * j = n
            }                                                                // 3 * 3 = 9
        }
    }
}

