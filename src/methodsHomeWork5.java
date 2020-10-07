public class methodsHomeWork5 {
    public static void main(String[] args) {


        int index = 0;
        String[] names = {"john", "michael", "gphilipppre", "philip", "ilena", "palena", "fahry"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("philip")) {
                index = i;
                break;
            }
        }
        System.out.println(index);

        int[] testArray = {10, 25, 36, 65, 95, 85, 150};
        System.out.println("Average is: " + sumArray(testArray) / testArray.length);
    }

    public static int sumArray(int[] testArray) {
        int sum = 0;
        for (int i : testArray) {
            sum += i;
        }
        return sum;
    }
}

