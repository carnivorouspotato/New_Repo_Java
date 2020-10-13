import javax.swing.*;

public class Class10 {
    public int paperAmount = 100;
    public int maxToner = 100;

    public int usedToner(int tonerUsed) {
        int level = 0;
        for (int i = 0; i <= maxToner; i--) {
            level = maxToner - tonerUsed;

            if (level == maxToner) {
                System.out.println("Toner is Full");
                break;
            } else {
                System.out.println("You have " + level + "% toner left");
                break;
            }


        }
        return level;

    }

    public int usedPaper(int paperUsed) {
        int level = 0;
        for (int i = 0; i <= paperAmount; i--) {
            level = paperAmount - paperUsed;
            if (level == paperAmount) {
                System.out.println("Your Paper tray is full");
                break;
            } else {
                System.out.println("You have " + level + " pages left");
                break;
            }



        }
        return level;
    }

}











