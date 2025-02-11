package com.fro.thelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Declare variables
    static TextView button1;
    TextView button3;
    static ImageView pie1;
    ImageView pie3;
    static TextView percent1;
    TextView percent3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate variables
        button1 = findViewById(R.id.button1);
        button3 = findViewById(R.id.button3);
        pie1 = findViewById(R.id.pie1);
        pie3 = findViewById(R.id.pie3);
        percent1 = findViewById(R.id.percent1);
        percent3 = findViewById(R.id.percent3);

        // switches pages
        button1.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), SinglyLinkedActivity.class)));
        button3.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), DoublyLinkedActivity.class)));

        check1(Values.totalPercent1);
    }

    // checks to see if it needs to change the pie chart
    public static void check1(int num){
        if (num == 0 && Values.totalPercent1 <= 0){
            percent1.setText("0% Completed");
            pie1.setBackgroundResource(R.drawable.pie_0);
            button1.setText("Begin -->");
            Values.totalPercent1 = 0;
        }
        else if (num == 25 && Values.totalPercent1 <= 25){
            percent1.setText("25% Completed");
            pie1.setBackgroundResource(R.drawable.pie_25);
            button1.setText("Continue -->");
            Values.totalPercent1 = 25;
        }
        else if (num == 50 && Values.totalPercent1 <= 50){
            percent1.setText("50% Completed");
            pie1.setBackgroundResource(R.drawable.pie_50);
            button1.setText("Continue -->");
            Values.totalPercent1 = 50;
        }
        else if (num == 75 && Values.totalPercent1 <= 75){
            percent1.setText("75% Completed");
            pie1.setBackgroundResource(R.drawable.pie_75);
            button1.setText("Continue -->");
            Values.totalPercent1 = 75;
        }
        else if (num == 100 && Values.totalPercent1 <= 100){
            percent1.setText("100% Completed");
            pie1.setBackgroundResource(R.drawable.pie_100);
            button1.setText("Go -->");
            Values.totalPercent1 = 100;
        }
    }
}