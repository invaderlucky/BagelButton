package bagelbudy.diamondhacks.csc.ncsu.edu.com.bagelbuddy;

/**
 * Created by Dana on 3/28/2015.
 */
public class Favorite {
    private int rating;
    private String name;
    private String bagel;
    private String creamCheese;

    public Favorite (String bagel, String creamCheese, int rating, String name) {
        this.bagel = bagel;
        this.creamCheese = creamCheese;
        this.rating = rating;
        this.name = name;
    }

    public int getRating () {
        return rating;
    }

    public String getName () {
        return name;
    }

    public String getBagel () {
        return bagel;
    }

    public String getCreamCheese () {
        return creamCheese;
    }

    public void setRating (int rate) {
        rating = rate;
    }

    public void setName (String name) {
        this.name = name;
    }
}