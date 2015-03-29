package bagelbudy.diamondhacks.csc.ncsu.edu.com.bagelbuddy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import bagelbudy2.diamondhacks.csc.ncsu.edu.com.bagelbuddy.R;


public class MainActivity extends ActionBarActivity {

    private static BagelBuddy app = new BagelBuddy();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load main screen
        setContentView(R.layout.activity_main);

        // action listener for Get Bagel button
        Button b = (Button) findViewById(R.id.myButton);
        b.setOnClickListener(
            new Button.OnClickListener() {
                public void onClick(View v) {
                    showBagel(v);
                }
            }
        );
    }

    public void showBagel(View view) {
        // move to next screen
        setContentView(R.layout.activity_second);

        // print chosen bagel
        TextView text = (TextView) findViewById(R.id.textViewBagel);
        text.setText(app.printResult());

        // get the image for the chosen bagel
        String currentBagel = app.getCurrentBagel();
        ImageView image = (ImageView)findViewById(R.id.imageView);
        if(currentBagel.equals("Asiago Parmesan")) { image.setImageResource(R.mipmap.asiagoparm); }
        else if(currentBagel.equals("Cinnamon Sugar")) { image.setImageResource(R.mipmap.cinnamonsugar); }
        else if(currentBagel.equals("Garlic")) { image.setImageResource(R.mipmap.garlic); }
        else if(currentBagel.equals("Onion")) { image.setImageResource(R.mipmap.onion); }
        else if(currentBagel.equals("Poppy")) { image.setImageResource(R.mipmap.poppy); }
        else if(currentBagel.equals("Rosemary Olive Oil")) { image.setImageResource(R.mipmap.roseoliveoil); }
        else if(currentBagel.equals("Salt")) { image.setImageResource(R.mipmap.salt); }
        else if(currentBagel.equals("Sesame")) { image.setImageResource(R.mipmap.sesame); }
        else if(currentBagel.equals("Whole Wheat")) { image.setImageResource(R.mipmap.wholewheat); }
        else if(currentBagel.equals("Pumpernickel")) { image.setImageResource(R.mipmap.pumpernickel); }
        else if(currentBagel.equals("Plain")) { image.setImageResource(R.mipmap.plain); }
        else if(currentBagel.equals("Honey Grain")) { image.setImageResource(R.mipmap.honeygrain); }
        else if(currentBagel.equals("Blueberry")) { image.setImageResource(R.mipmap.blueberry); }
        else if(currentBagel.equals("Cinnamon Raisin")) { image.setImageResource(R.mipmap.cinnamonraison); }
        else if(currentBagel.equals("Everything")) { image.setImageResource(R.mipmap.everything); }
        else if(currentBagel.equals("Sundried Tomato")) { image.setImageResource(R.mipmap.sundriedtomato); }

        // action listener for No button
        Button b = (Button) findViewById(R.id.buttonNo);
        b.setOnClickListener(
            new Button.OnClickListener() {
                public void onClick(View v) {
                    showBagel(v);
                }
            }
        );

        // action listener for Yes button
        b = (Button) findViewById(R.id.buttonYes);
        b.setOnClickListener(
            new Button.OnClickListener() {
                public void onClick(View v) {
                    showRate(v);
                }
            }
        );
    }

    public void showRate(View view) {
        setContentView(R.layout.activity_third);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
