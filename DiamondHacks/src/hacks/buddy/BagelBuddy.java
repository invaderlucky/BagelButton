package hacks.buddy;

import java.util.*;

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

      System.out.println();

      switch(comment) {
        case 1: System.out.printf("Don't miss the delightful creation that is %s and %s!\n", bagelOfChoice, creamCheeseOfChoice);
                break;
        case 2: System.out.printf("You have got to eat %s and %s!\n", bagelOfChoice, creamCheeseOfChoice);
                break;
        case 3: System.out.printf("If you haven't tried %s and %s, you're not living life, man!\n", bagelOfChoice, creamCheeseOfChoice);
                break;
        case 4: System.out.printf("Dude, where's my %s and %s?\n", bagelOfChoice, creamCheeseOfChoice);
                break;
        default: System.out.print("You shouldn't be here!\n");
      }

      System.out.println("\nAre you happy now? (y/n) ");
      answer = console.next();

      satisfied = answer.charAt(0);
    }

    System.out.println("Do you want to add this bagel to your favorites? (y/n) ");
    fav = console.next().charAt(0);

    if(fav == 'y' || fav == 'Y') {
        System.out.println("Enter rating from 1 to 5: ");
        while (!console.hasNextInt()) {
            console.next();
            System.out.println("Invalid input. Enter rating from 1 to 5: ");
        }
        rating = console.nextInt();
        System.out.println("Enter special name for your bagel: ");
        name = console.next();
        favArray.add(new Favorite(bagelOfChoice, creamCheeseOfChoice, rating, name));
    }

    System.out.println("\nWell, I hope your bagel isn't as cold as your heart or as gross as your poop.\n");

  }
}
