package au.edu.swin.sdmd.historyappjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * This app will show some details about images, triggered by button clicks.
 *
 * The app itself shows how data can be passed between two activities using intents.
 * It also shows how layouts can be nested.
 *
 * This class is the main activity of our app.
 *
 * @author nronald
 * June 2018
 */

public class MainActivity extends AppCompatActivity {
    // These are our constants for the intent values. This practice is useful for when intent
    // bundles are returned to this class.
    private static final String TITLE_KEY = "title";
    private static final String IMAGE_KEY = "image";
    private static final String AUTHOR_KEY = "author";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * In this app the button click handlers are attached in the layout.
     * If you change the names of these functions, then remember to update the layout.
     * Note for this to work, a View needs to be passed as a parameter.
     */
    public void stationClickHandler(View v) {
        showDetail(R.string.station, R.string.station_author, R.drawable.station);
    }

    public void collegeClickHandler(View v) {
        showDetail(R.string.college, R.string.college_author, R.drawable.college);
    }

    public void theatreClickHandler(View v) {
        showDetail(R.string.theatre, R.string.theatre_author, R.drawable.theatre);
    }

    /**
     * This is where the intents are specified, given the title, author and image ids.
     * Note ids are ints.
     */
    private void showDetail(int title, int author, int id) {
        // Three values are added to the bundle passed with the intent,
        // using the keys specified in this class.
        Bundle dataBundle = new Bundle();
        dataBundle.putInt(TITLE_KEY, title);
        dataBundle.putInt(AUTHOR_KEY, author);
        dataBundle.putInt(IMAGE_KEY, id);

        // The receiver of the intent is the ImageActivity class, which handles
        // the appearance of the detail view.
        Intent imageDetailIntent = new Intent(this, ImageActivity.class);
        imageDetailIntent.putExtras(dataBundle);

        // The new activity is started with the intent.
        startActivity(imageDetailIntent);
    }
}
