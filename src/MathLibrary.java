public class MathLibrary {
    /**public int addition(int num1, int num2) {
        return num1 + num2;

    }

   /** public int subtwo(int num1, int num2) {
        return num1 - num2;

    }

    /**public int multiply(int num1, int num2) {
        return num1 * num2;
    }

   /** public double dividetwo(double num1, int num2) {
        double result = -1.00;
        if (num2 != 0) {
            result = num1 / num2;
        }
        return result;
    }

    /**public int primeTest(int prime) {
        int num = 0;
        boolean flag = false;
        for (int i = 0; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
            }

        }
        return prime;*/
    

    public double arrOne(double[] arr) {
        double sum = -1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public String reverseString(String str) {
        String res = "";

        for (int i = str.length() - 1; i <= 0; i--) {
            res = res + str.charAt(i);
        }
        return res;
    }
}
