public class Class10Practice {




    public static void main(String[] args) {
        Class10 printingMethods = new Class10();
         int test2 = printingMethods.usedToner(91);
        for (int i = 0 ; i <= Class10.maxToner ; i--){
            if (test2 <= Class10.maxToner && test2 >= 10){
                System.out.println("You have " + test2 + " % toner left");
            break;


            }
            if (test2 <= 10){
                System.out.println("Toner is low");
                break;
            }
        }
        int test3 = printingMethods.usedPaper(0);




        int test5 = printingMethods.twoSided(15);
        int test6 =printingMethods.twoSidedTonerUse(55);
        int test7 = printingMethods.addedPaper(55);
        System.out.println("test6 "+ test6);

int test10 = test6 + test2;
        System.out.println("test10 " + test10);




    }
    }

