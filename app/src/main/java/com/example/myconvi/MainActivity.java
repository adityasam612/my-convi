package com.example.myconvi;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.output);
        editText = findViewById(R.id.label);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editText.getText().toString();
                  int rup = Integer.parseInt(s);
                    double  dollar =75.5*rup;
                    textView.setText("Your converted value in Rupee is "+ dollar);
            }
        });

    }
}