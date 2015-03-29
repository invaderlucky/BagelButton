package bagelbudy.diamondhacks.csc.ncsu.edu.com.bagelbuddy;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BagelBuddy {

    public static final int NO_OF_BAGELS = 16;
    public static final int NO_OF_CREAM_CHEESE = 10;
    public static final int NO_OF_COMMENTS = 4;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        ArrayList<Favorite> favArray = new ArrayList<Favorite>();

        String[] bagelList = {"Asiago Parmesan", "Cinnamon Sugar", "Garlic",
                "Onion", "Poppy", "Rosemary Olive Oil", "Sesame",
                "Sundried Tomato", "Blueberry", "Cinnamon Raisin",
                "Everything", "Honey Grain", "Plain", "Pumpernickel",
                "Salt","Whole Wheat"};

        String[] creamCheeseList = {"Plain", "Garden Veggie", "Honey Walnut",
                "Jalapeno", "Light Herb Garlic", "Olive Pimiento",
                "Onion & Chive", "Strawberry", "Bacon Scallion", "Smoked Salmon"};

        char satisfied = 'n';
        String answer;
        char fav;
        String bagelOfChoice = "";
        String creamCheeseOfChoice = "";
        int rating;
        String name;

        while(satisfied == 'n' || satisfied == 'N') {
            Random rand = new Random();

            int bagel = rand.nextInt(NO_OF_BAGELS);
            int creamCheese = rand.nextInt(NO_OF_CREAM_CHEESE);
            int comment = rand.nextInt(NO_OF_COMMENTS) + 1;

            bagelOfChoice = bagelList[bagel];
            creamCheeseOfChoice = creamCheeseList[creamCheese];

            Log.d();

            switch(comment) {
                case 1: Log.d("here", String("Don't miss the delightful creation that is %s and %s!\n", bagelOfChoice, creamCheeseOfChoice);
                    break;
                case 2: Log.d("You have got to eat %s and %s!\n", bagelOfChoice, creamCheeseOfChoice);
                    break;
                case 3: Log.d("If you haven't tried %s and %s, you're not living life, man!\n", bagelOfChoice, creamCheeseOfChoice);
                    break;
                case 4: Log.d("Dude, where's my %s and %s?\n", bagelOfChoice, creamCheeseOfChoice);
                    break;
                default: System.out.print("You shouldn't be here!\n");
            }

            Log.d("\nAre you happy now? (y/n) ");
            answer = console.next();

            satisfied = answer.charAt(0);
        }

        Log.d("Do you want to add this bagel to your favorites? (y/n) ");
        fav = console.next().charAt(0);

        if(fav == 'y' || fav == 'Y') {
            Log.d("Enter rating from 1 to 5: ");
            while (!console.hasNextInt()) {
                console.next();
                Log.d("Invalid input. Enter rating from 1 to 5: ");
            }
            rating = console.nextInt();
            Log.d("Enter special name for your bagel: ");
            name = console.next();
            favArray.add(new Favorite(bagelOfChoice, creamCheeseOfChoice, rating, name));
        }

        Log.d("\nWell, I hope your bagel isn't as cold as your heart or as gross as your poop.\n");

    }
}
