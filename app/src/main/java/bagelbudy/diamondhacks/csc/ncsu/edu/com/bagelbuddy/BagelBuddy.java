package bagelbudy.diamondhacks.csc.ncsu.edu.com.bagelbuddy;

import java.util.Random;

public class BagelBuddy {

    public static final int NO_OF_BAGELS = 16;
    public static final int NO_OF_CREAM_CHEESE = 10;
    public static final int NO_OF_COMMENTS = 4;

    public static String printOutput() {
        String[] bagelList = {"Asiago Parmesan", "Cinnamon Sugar", "Garlic",
                "Onion", "Poppy", "Rosemary Olive Oil", "Sesame",
                "Sundried Tomato", "Blueberry", "Cinnamon Raisin",
                "Everything", "Honey Grain", "Plain", "Pumpernickel",
                "Salt","Whole Wheat"};

        String[] creamCheeseList = {"Plain", "Garden Veggie", "Honey Walnut",
                "Jalapeno", "Light Herb Garlic", "Olive Pimiento",
                "Onion & Chive", "Strawberry", "Bacon Scallion", "Smoked Salmon"};

        Random rand = new Random();

        int bagel = rand.nextInt(NO_OF_BAGELS);
        int creamCheese = rand.nextInt(NO_OF_CREAM_CHEESE);
        int comment = rand.nextInt(NO_OF_COMMENTS) + 1;

        String bagelOfChoice = bagelList[bagel];
        String creamCheeseOfChoice = creamCheeseList[creamCheese];

        switch (comment) {
            case 1:
                return "Don't miss the delightful creation that is %s and %s!\n" + bagelOfChoice + creamCheeseOfChoice;
            case 2:
                return "You have got to eat %s and %s!\n" + bagelOfChoice + creamCheeseOfChoice;
            case 3:
                return "If you haven't tried %s and %s, you're not living life, man!\n" + bagelOfChoice + creamCheeseOfChoice;
            case 4:
                return "Dude, where's my %s and %s?\n" + bagelOfChoice + creamCheeseOfChoice;
            default:
                return "You shouldn't be here!\n";
        }
    }
}