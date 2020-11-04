package com.adore96.sign_android;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class contributions extends AppCompatActivity {

    public static final CharSequence[] DAYS_OPTIONS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contributions);

        Spinner s = (Spinner) findViewById(R.id.spinner);
        //Prepar adapter
        //HERE YOU CAN ADD ITEMS WHICH COMES FROM SERVER.
        final MyData items[] = new MyData[4];

        items[0] = new MyData("- Select One -", "value1");
        items[1] = new MyData("key1", "value1");
        items[2] = new MyData("key2", "value2");
        items[3] = new MyData("key3", "value3");
        ArrayAdapter<MyData> adapter = new ArrayAdapter<MyData>(this,
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                MyData d = items[position];

                //Get selected value of key
                String value = d.getValue();
                String key = d.getSpinnerText();
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    class MyData {
        public MyData(String spinnerText, String value) {
            this.spinnerText = spinnerText;
            this.value = value;
        }

        public String getSpinnerText() {
            return spinnerText;
        }

        public String getValue() {
            return value;
        }

        public String toString() {
            return spinnerText;
        }

        String spinnerText;
        String value;
    }
}