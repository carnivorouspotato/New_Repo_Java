public class Calculations {
    public static void main(String[] args) {

        MathLibrary m3 = new MathLibrary();
        String revString = "hello";
        String revString2 = m3.reverseString(revString);
        System.out.println(revString2);


        MathLibrary newLibrary = new MathLibrary();
        double[] testArray = {22.5, 65.35, 55.4, 85.9};
        System.out.println(newLibrary.arrOne(testArray));
    }
}