package bagelbudy.diamondhacks.csc.ncsu.edu.com.bagelbuddy;

import android.util.Log;

import java.util.Random;

public class BagelBuddy {

    private static final int NO_OF_BAGELS = 16;
    private static final int NO_OF_CREAM_CHEESE = 10;
    private static final int NO_OF_COMMENTS = 4;

    private String currentBagel = "";

    public String printResult() {
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

        currentBagel = bagelList[bagel];
        String creamCheeseOfChoice = creamCheeseList[creamCheese];

        switch (comment) {
            case 1:
                //Log.d("here", "Don't miss the delightful creation that is " + bagelOfChoice + " and " + creamCheeseOfChoice + "!\n");
                return "Don't miss the delightful creation that is " + currentBagel + " and " + creamCheeseOfChoice + "!\n";
            case 2:
                //Log.d("here", "You have got to eat " + bagelOfChoice + " and " + creamCheeseOfChoice + "!\n");
                return "You have got to eat " + currentBagel + " and " + creamCheeseOfChoice + "!\n";
            case 3:
                //Log.d("here", "If you haven't tried " + bagelOfChoice + " and " + creamCheeseOfChoice + ", you're not living life, man!\n");
                return "If you haven't tried " + currentBagel + " and " + creamCheeseOfChoice + ", you're not living life, man!\n";
            case 4:
                //Log.d("here", "Dude, where's my " + bagelOfChoice + " and " + creamCheeseOfChoice + "?\n");
                return "Dude, where's my " + currentBagel + " and " + creamCheeseOfChoice + "?\n";
            default:
                //Log.d("here", "You shouldn't be here!\n");
                return "You shouldn't be here!\n";
        }
    }

    public String getCurrentBagel() {
        return currentBagel;
    }
}