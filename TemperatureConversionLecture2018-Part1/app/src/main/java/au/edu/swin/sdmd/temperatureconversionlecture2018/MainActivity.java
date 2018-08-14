package au.edu.swin.sdmd.temperatureconversionlecture2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// TODO #1 Set up all the views needed: EditText for the celsius value, a Button and a TextView for the fahrenheit value.
// TODO #1a limit keyboard entry for celsius value.

// TODO #2 Record UI tests and edit.

// TODO #4 Create the conversion class/model.
// TODO #4a Write unit tests and run.
// TODO #4b Finalise the model.

// TODO #7 Create new landscape layout using ConstraintLayout.

public class MainActivity extends AppCompatActivity {

    // TODO #5 create a local variable to store the model.
    Conversion conversion = new Conversion();

    // TODO #3 add initializeUI() call.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialiseUI();
    }

    // TODO #3a Connect up the button listener here.
    // TODO #6c Refactor to restore state.
    void initialiseUI() {
        Button convert = findViewById(R.id.bConvert);
        convert.setOnClickListener(clickListener);
    }

    // TODO #3b write click listener using anonymous class
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            convertValue();
        }
    };


    // TODO #3c write a function to process button click using dummy data. Run app.
    // TODO #5a Fix up the actual data using the model.
    // TODO #5b run UI tests again
    void convertValue() {
        EditText celsius = findViewById(R.id.etCelsius);
        String sFahrenheit = conversion.toFahrenheit(celsius.getText().toString());
        TextView fahrenheit = findViewById(R.id.tvFahrenheit);
        fahrenheit.setText(sFahrenheit + " F");
    }



    // TODO #6 write UI test for orientation change.
    // TODO #6a Update the saved instance state here.

    // TODO #6b write a function to restore state here.
}
