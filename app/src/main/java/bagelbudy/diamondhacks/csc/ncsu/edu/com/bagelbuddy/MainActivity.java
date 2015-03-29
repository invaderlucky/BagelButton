package bagelbudy.diamondhacks.csc.ncsu.edu.com.bagelbuddy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
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
        setContentView(R.layout.activity_main);

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
        setContentView(R.layout.activity_second);
        TextView text = (TextView) findViewById(R.id.textViewBagel);
        String output = app.printResult();
        text.setText(output);
        //System.out.println(app.printOutput());
        ImageView image = (ImageView)findViewById(R.id.imageView);
        if(output.contains("Asiago Parmesan")) { image.setImageResource(R.mipmap.asiagoparm); }
        else if(output.contains("Cinnamon Sugar")) { image.setImageResource(R.mipmap.cinnamonsugar); }
        else if(output.contains("Garlic")) { image.setImageResource(R.mipmap.garlic); }
        else if(output.contains("Onion")) { image.setImageResource(R.mipmap.onion); }
        else if(output.contains("Poppy")) { image.setImageResource(R.mipmap.poppy); }
        else if(output.contains("Rosemary Olive Oil")) { image.setImageResource(R.mipmap.roseoliveoil); }
        else if(output.contains("Salt")) { image.setImageResource(R.mipmap.salt); }
        else if(output.contains("Sesame")) { image.setImageResource(R.mipmap.sesame); }
        else if(output.contains("Whole Wheat")) { image.setImageResource(R.mipmap.wholewheat); }
        else if(output.contains("Pumpernickel")) { image.setImageResource(R.mipmap.pumpernickel); }
        else if(output.contains("Plain")) { image.setImageResource(R.mipmap.plain); }
        else if(output.contains("Honey Grain")) { image.setImageResource(R.mipmap.honeygrain); }
        else if(output.contains("Blueberry")) { image.setImageResource(R.mipmap.blueberry); }
        else if(output.contains("Cinnamon Raisin")) { image.setImageResource(R.mipmap.cinnamonraison); }
        else if(output.contains("Everything")) { image.setImageResource(R.mipmap.everything); }
        else if(output.contains("Sundried Tomato")) { image.setImageResource(R.mipmap.sundriedtomato); }
        Button b = (Button) findViewById(R.id.buttonNo);
        b.setOnClickListener(
            new Button.OnClickListener() {
                public void onClick(View v) {
                    showBagel(v);
                }
            }
        );

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
       // setContentView(R.layout.activity_third);
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
