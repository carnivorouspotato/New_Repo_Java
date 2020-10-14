import javax.swing.*;

public class Class10 {
    public static int paperAmount = 100;
    public static int maxToner = 100;


    public int usedToner(int tonerUsedSingle ) {
        int levelTonerUsed = 0;
        for (int i = 0; i <= maxToner; i--) {
            levelTonerUsed = maxToner - tonerUsedSingle;

            if (levelTonerUsed == maxToner) {
                System.out.println("Toner is Full");
                break;
            } else {
                System.out.println("You have " + levelTonerUsed + "% toner left");
                break;
            }


        }
        return levelTonerUsed;

    }

    public int usedPaper(int paperUsed) {
        int levelPaperUsed = 0;
        for (int i = 0; i <= paperAmount ; i--) {
            levelPaperUsed = paperAmount - paperUsed;
            if (levelPaperUsed == paperAmount) {
                System.out.println("single sided printing: Your Paper tray is full.");
                break;
            }
            if (levelPaperUsed <= 0) {
                System.out.println("Single sided printing: not enough supplies");
            break;
            }
            else if (levelPaperUsed < paperAmount && levelPaperUsed > 0){
                System.out.println("Single sided printing: You have: " + levelPaperUsed + " pages left");
                break;
            }


            }
        return levelPaperUsed;

        }



    public int twoSided(int twoSidedPrint) {
        int levelDoublePrint = 0;
        for (int i = 0; i <= paperAmount; i--) {
            levelDoublePrint = paperAmount - (twoSidedPrint * 2);
            if (levelDoublePrint < paperAmount) {
                System.out.println("You have printed: " + levelDoublePrint + " pages using double sided.");
                break;

            }


        }
        return levelDoublePrint;


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


    public int addedPaper(int paperAdded) {
        int levelPaperAdded = 0;
        for (int i = 0; i <= paperAmount; i++) {
            levelPaperAdded = paperAmount + paperAdded;
            System.out.println("You have: " + levelPaperAdded + " pages remaining.");
            break;
        }


        return levelPaperAdded;
    }
}















