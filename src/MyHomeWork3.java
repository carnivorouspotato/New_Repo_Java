public class MyHomeWork3 {
    public static void main(String[] args) {
        /**
         * Store your full name in a variable, and display the following:
         *     1. Display length of the first name.
         *     2. Does your last name starts with "K" (Ignoring cases)
         *     3. print the last alphabet of your first name
         *     4. Does your last name ends with "M" (Ignoring cases)
         */



        String myName = "David Smith";
        int myName2 = myName.lastIndexOf("d");
        System.out.println(myName2);
        String myLastName = "Smith";
        boolean lastNameResult = myLastName.startsWith("K");
        System.out.println(lastNameResult);
        String  lastOfFirst = myName.substring(4,5);
        System.out.println(lastOfFirst);
        boolean lastNameResult2 = myName.endsWith("M");
        System.out.println(lastNameResult2);






        /**
         * String myStatment = "I am a good programmer";
         * Use string methods to do following tasks:
         * 	1. Display the total number of words in the myStatement.
         * 	2. replace all the 'r' characters with 'f' characters.
         */
        String myStatment = "I am a good programmer";
        System.out.println(myStatment.length());
        String myStatmentR = myStatment.replace("r", "f");
        System.out.println(myStatmentR);


        /**
         * Store your first name in a string variable.
         * Calculate the length of your first name, without using length() method of String class.
         */
        String firstName = "David";
        int fistNameLength = firstName.lastIndexOf("d");
        System.out.println(fistNameLength);

        /**
         *
         * String strNew = "hello dear, how are you?";
         *
         * Assign result (boolean) as true if length of strNew if greater than 10
         * else assign false.
         *
         * print the result value.
         *
         */

        String strNew = "hello dear, how are you?";
        int strNewReturn = strNew.length();
        System.out.println(strNewReturn);
if (strNewReturn > 10){
    System.out.println("true");
} else {
    System.out.println("false");
}




    }

}
