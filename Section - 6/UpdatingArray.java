import java.util.Arrays;

public class UpdatingArray {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Mocchaito"};
        String menuString = Arrays.toString(menu);
        System.out.println(menuString);
        menu[2] = "Latte";
        menuString = Arrays.toString(menu);
        System.out.println(menuString);
        
        String[] newMenu = new String[5];

        for(int i=0;i<menu.length;i++){
            newMenu[i] = menu[i];
        }
        System.out.println("New menu before insert"+Arrays.toString(newMenu));
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        for(int j =0 ; j<newMenu.length ; j++){
            System.out.println(j+". "+newMenu[j]);
        }
    }
}
