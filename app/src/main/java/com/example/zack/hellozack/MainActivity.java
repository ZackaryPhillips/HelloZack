package com.example.zack.hellozack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimaryDark));
        }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.orange));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // grab the text the user inputted
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Zack!");
                } else {
                    // put the text into our text view once the "Change text" button is clicked
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // reset the text color back to black
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));

                // reset the background color back to colorPrimaryDark
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorPrimary));

                // reset the text back to "Hello from Zack!"
                ((TextView) findViewById(R.id.textView)).setText("Hello from Zack!");
            }
        });



    }
}
