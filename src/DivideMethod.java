
public class DivideMethod{
    public static void main(String[] args) {
        divide(1, 3);
       
              
    }
   
    public static void divide(int num1, int num2) {
         double temp = num2;
        double num3 = num1/temp ;
        System.out.println("" + num1 + " / " + num2 + " = " + num3);
    }
}