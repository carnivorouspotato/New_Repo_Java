package Class12Test;

public class ArrayCoding {
    //     * Question 1:
////            * Create a method to return an int-array after removing all even values
////         * from a given int array.
////            *
////            * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}
////            * Returned array: {}
////         *
////                 * Input array:     {1, 2, 4, 3, 1, 6, 1}
////            * Returned Array:  {1, 3, 1, 1}
////         *
////                 *
////                 */
public static int[] testArray (int[] arrayTwo) {
    int num = 0;
    for (int i = 0; i < arrayTwo.length; i++) {
        if (arrayTwo[i] % 2 == 0) {
            num++;
            //System.out.println(arrayTwo[i]);
        }

    }
    int[] newArray = new int[num];
    //System.out.println(num);
int numTwo = 0;
    for (int i = 0; i < arrayTwo.length; i++) {
        if (arrayTwo[i] % 2 == 0) {
            newArray[numTwo] = arrayTwo[i];
            numTwo++;
            //System.out.println(arrayTwo[i]);
        }
    }
        return newArray;

}
    public static void main(String[] args) {
        int[] arrayThree =      {1, 2, 4, 3, 1, 6, 1, 10};
        testArray(arrayThree);

        for (int num : testArray(arrayThree)){
            System.out.println(num);
        }
    }


}
