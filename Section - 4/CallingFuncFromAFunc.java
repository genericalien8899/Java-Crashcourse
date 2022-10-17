//own experimental code not from course

public class CallingFuncFromAFunc {
    public static void main(String[] args) {
        measureAreaofRectangle(3.5, 5.5);
        measureAreaofRectangle(2.9,3.3);
    }
    public static double measureAreaofRectangle(double len, double wid){
        double area = len * wid ;
        System.out.println("The area of the rectangle is "+area);
        areaPrinter(len,wid,area);
        return (area);
    }
    public static void areaPrinter(double len , double wid, double area){
        System.out.println("The area of triangle of lenghth " + len + " and width " + wid + " is "+ area );
    }
}
