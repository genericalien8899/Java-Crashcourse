import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffsLastyear = {"tommy", "jimmy","joel"};
        System.out.println(Arrays.toString(staffsLastyear));
        
        //String[] staffsThisYear = staffsLastyear;
        //if a value is updated in staffsThisYear variable it will also reflect in staffs last year variable because both the variables has reference of same array
        String[] staffsThisYear = new String[3];
        staffsThisYear = Arrays.copyOf(staffsLastyear, staffsLastyear.length);  // This can be used instead of for loop to iterate through elements and create them
        staffsThisYear[1] = "Chris";                 //as we have created a new array and copied the contents of the array into it, change in this variable wont affect the other variable
        System.out.println(Arrays.toString(staffsThisYear) );
    }
}
