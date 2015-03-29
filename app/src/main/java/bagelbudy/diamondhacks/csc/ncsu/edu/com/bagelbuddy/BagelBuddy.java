package bagelbudy.diamondhacks.csc.ncsu.edu.com.bagelbuddy;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

public class BagelBuddy {

    private static final int NO_OF_BAGELS = 16;
    private static final int NO_OF_CREAM_CHEESE = 10;
    private static final int NO_OF_COMMENTS = 4;

    private String currentBagel = "";
    private String currentCreamCheese = "";

    private ArrayList<Favorite> favorites = new ArrayList<Favorite>();
    private ArrayList<Favorite> dislikeList = new ArrayList<Favorite>();

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
        currentCreamCheese = creamCheeseList[creamCheese];

        switch (comment) {
            case 1:
                //Log.d("here", "Don't miss the delightful creation that is " + bagelOfChoice + " and " + creamCheeseOfChoice + "!\n");
                return "Don't miss the delightful creation that is " + currentBagel + " and " + currentCreamCheese + "!\n";
            case 2:
                //Log.d("here", "You have got to eat " + bagelOfChoice + " and " + creamCheeseOfChoice + "!\n");
                return "You have got to eat " + currentBagel + " and " + currentCreamCheese + "!\n";
            case 3:
                //Log.d("here", "If you haven't tried " + bagelOfChoice + " and " + creamCheeseOfChoice + ", you're not living life, man!\n");
                return "If you haven't tried " + currentBagel + " and " + currentCreamCheese + ", you're not living life, man!\n";
            case 4:
                //Log.d("here", "Dude, where's my " + bagelOfChoice + " and " + creamCheeseOfChoice + "?\n");
                return "Dude, where's my " + currentBagel + " and " + currentCreamCheese + "?\n";
            default:
                //Log.d("here", "You shouldn't be here!\n");
                return "You shouldn't be here!\n";
        }
    }

    public String getCurrentBagel() {
        return currentBagel;
    }

    public boolean addToFavorites(int rating, String name) {
        Favorite fav = new Favorite(currentBagel, currentCreamCheese, rating, name);
        for (int i = 0; i < favorites.size(); i++) {
            if (fav.getBagel().equals(favorites.get(i).getBagel()) &&
                fav.getCreamCheese().equals(favorites.get(i).getCreamCheese())) {
                favorites.get(i).setRating(fav.getRating());
                favorites.get(i).setName(fav.getName());
                return true;
            }
        }
        return favorites.add(fav);
    }

    public boolean addToDislikeList() {
        Favorite fav = new Favorite(currentBagel, currentCreamCheese, 0, "");
        for (int i = 0; i < dislikeList.size(); i++) {
            if (fav.getBagel().equals(dislikeList.get(i).getBagel()) &&
                    fav.getCreamCheese().equals(dislikeList.get(i).getCreamCheese())) {
                return true;
            }
        }
        return dislikeList.add(fav);
    }

    public ArrayList<Favorite> getFavorites() {
        return favorites;
    }

    public ArrayList<Favorite> getDislikeList() {
        return dislikeList;
    }
}