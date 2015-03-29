package bagelbudy.diamondhacks.csc.ncsu.edu.com.bagelbuddy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
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
        text.setText(app.printOutput());
        //System.out.println(app.printOutput());

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
