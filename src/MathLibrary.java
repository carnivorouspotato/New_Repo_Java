public class MathLibrary {
    public int addition (int num1, int num2 ){
        return num1 + num2;

    }
    public int subtwo ( int num1, int num2){
        return num1 - num2;

    }
    public int multiply (int num1, int num2){
        return num1 * num2;
    }
   public double dividetwo (double num1, int num2){
        double result = -1.00;
        if (num2 != 0){
            result = num1/num2;
        }
        return result;
   }
}
