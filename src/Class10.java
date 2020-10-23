import javax.swing.*;

public class Class10 {
    public static int paperAmount = 100;
    public static int maxToner = 100;


    public int usedToner(int tonerUsedSingle) {
        System.out.println("While printing one sided, your toner Levels are:");
        int levelTonerUsed = 0;
        for (int i = 0; i <= maxToner; i--) {
            levelTonerUsed = maxToner - tonerUsedSingle;

            if (levelTonerUsed == maxToner) {
                System.out.println("Toner is Full");
                break;
            }
            if (levelTonerUsed <= 10) {
                System.out.println(levelTonerUsed + "% of toner left." + " Toner is low.");
                break;
            } else {
                System.out.println("You have " + levelTonerUsed + "% toner left");
                break;
            }


        }
        return levelTonerUsed;

    }

    public int usedPaper(int pagesPrinted) {
        System.out.println("While printing one sided, your paper levels are: ");
        int levelPaperUsed = 0;
        for (int i = 0; i <= paperAmount; i--) {
            levelPaperUsed = paperAmount - pagesPrinted;
            if (levelPaperUsed == paperAmount) {
                System.out.println("single sided printing: Your Paper tray is full.");
                break;
            }
            if (levelPaperUsed <= 0) {
                System.out.println("Single sided printing: not enough supplies");
                break;
            } else if (levelPaperUsed < paperAmount && levelPaperUsed > 0) {
                System.out.println("You have: " + levelPaperUsed + " page/s left");
                break;
            } else if (levelPaperUsed <= 10) {
                System.out.println("Single sided printing: Paper is low. You are at: " + levelPaperUsed + "pages.");

            }

        }
        return levelPaperUsed;

    }



    public int twoSided(int twoSidedPrint) {
        System.out.println("While Printing double sided: ");
        int doublePrintCount = 0;
        int doublePaperTotal = 0;
        int totalPagesUsed = 0;
        for (int i = 0; i <= paperAmount; i--) {
            doublePrintCount = twoSidedPrint;
           if (doublePrintCount <= paperAmount){
               System.out.println("You printed a total of: " + doublePrintCount + " single pieces of paper");
               break;
           }

           }

        for (int i = 0 ; i <= paperAmount ; i-- ) {
            totalPagesUsed = paperAmount - doublePrintCount * 2;
            if (totalPagesUsed <= paperAmount && totalPagesUsed >=0) {
                System.out.println("You used a total of: " + totalPagesUsed + " pages of toner.");
                break;

            }
        }

        for (int i = 0 ; i <= paperAmount ; i--){
            doublePaperTotal = paperAmount - doublePrintCount;
            if (doublePaperTotal <= paperAmount && doublePaperTotal >=0){
                System.out.println("Pages of paper remaning after double sided printing: " + doublePaperTotal);
            }

            break;

        }
        return doublePrintCount;


    }




    public int addedPaper(int paperAdded) {
        int levelPaperAdded = 0;
        for (int i = 0; i <= paperAmount; i++) {
            levelPaperAdded = paperAdded;
           if (levelPaperAdded >= paperAmount){
                System.out.println(" you can't add anymore paper");
                break;


        }
        if (levelPaperAdded <= paperAmount){
            System.out.println("You have added: " + levelPaperAdded + " pages.");
            break;
        }
        }

        return levelPaperAdded;
    }

    public int twoSidedTonerUse(int tonerUsed) {
        int levelDoubleToner = 0;
        for (int i = 0; i <= paperAmount; i--) {
            levelDoubleToner = tonerUsed * 2;
            if (levelDoubleToner < paperAmount) {
                System.out.println("You have: " + levelDoubleToner + "% toner remaining using double sided.");
                break;
            }


        }
        return levelDoubleToner;

    }

}















