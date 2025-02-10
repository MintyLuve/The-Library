package com.fro.thelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Declare variables
    TextView button1;
    TextView button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate variables
        button1 = findViewById(R.id.button1);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), SinglyLinkedActivity.class)));
        button3.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), DoublyLinkedActivity.class)));

    }
}