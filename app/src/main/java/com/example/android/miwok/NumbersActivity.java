package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //Keep track of the current index position
        int index = 0;

        while(index < words.size()){
            //Create a TextView with Java
            TextView wordView = new TextView(this);

            //set the text
            wordView.setText(words.get(index));

            //add to rootView
            rootView.addView(wordView);

            //increment the tracker
            index++;
        }

    }
}
