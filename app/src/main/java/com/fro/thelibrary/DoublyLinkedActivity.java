package com.fro.thelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DoublyLinkedActivity extends AppCompatActivity {
    // Declare variables
    TextView back;
    TextView back2;

    TextView question1;
    TextView question1_A;
    TextView question1_B;
    TextView question1_C;
    TextView question1_D;

    TextView question2;
    TextView question2_A;
    TextView question2_B;
    TextView question2_C;
    TextView question2_D;

    TextView question3;
    TextView question3_A;
    TextView question3_B;
    TextView question3_C;
    TextView question3_D;

    TextView question4;
    TextView question4_A;
    TextView question4_B;
    TextView question4_C;
    TextView question4_D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doubly_linked);

        //Instantiate variables
        back = findViewById(R.id.back);
        back2 = findViewById(R.id.back2);

        question1 = findViewById(R.id.question1);
        String question1_text = question1.getText().toString();
        question1_A = findViewById(R.id.question1_A);
        question1_B = findViewById(R.id.question1_B);
        question1_C = findViewById(R.id.question1_C);
        question1_D = findViewById(R.id.question1_D);

        question2 = findViewById(R.id.question2);
        String question2_text = question2.getText().toString();
        question2_A = findViewById(R.id.question2_A);
        question2_B = findViewById(R.id.question2_B);
        question2_C = findViewById(R.id.question2_C);
        question2_D = findViewById(R.id.question2_D);

        question3 = findViewById(R.id.question3);
        String question3_text = question3.getText().toString();
        question3_A = findViewById(R.id.question3_A);
        question3_B = findViewById(R.id.question3_B);
        question3_C = findViewById(R.id.question3_C);
        question3_D = findViewById(R.id.question3_D);

        question4 = findViewById(R.id.question4);
        String question4_text = question4.getText().toString();
        question4_A = findViewById(R.id.question4_A);
        question4_B = findViewById(R.id.question4_B);
        question4_C = findViewById(R.id.question4_C);
        question4_D = findViewById(R.id.question4_D);

        // Switching pages
        back.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
        back2.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        // Saving answers when switching pages + checking to see if question is correct
        if (Values.question5){
            correct(question1_text, 'A', question1, 25, question1_A, question1_B, question1_C, question1_D, 1);
        }
        else{
            question1_A.setOnClickListener(v -> correct(question1_text, 'A', question1, 25, question1_A, question1_B, question1_C, question1_D, 1));
            question1_B.setOnClickListener(v -> question1.setText(question1_text + " | B is incorrect"));
            question1_C.setOnClickListener(v -> question1.setText(question1_text + " | C is incorrect"));
            question1_D.setOnClickListener(v -> question1.setText(question1_text + " | D is incorrect"));
        }
        if (Values.question6){
            correct(question2_text, 'A', question2, 50, question2_A, question2_B, question2_C, question2_D, 2);
        }
        else{
            question2_A.setOnClickListener(v -> correct(question2_text, 'A', question2, 50, question2_A, question2_B, question2_C, question2_D, 2));
            question2_B.setOnClickListener(v -> question2.setText(question2_text + " | B is incorrect"));
            question2_C.setOnClickListener(v -> question2.setText(question2_text + " | C is incorrect"));
            question2_D.setOnClickListener(v -> question2.setText(question2_text + " | D is incorrect"));
        }
        if (Values.question7){
            correct(question3_text, 'C', question3, 75, question3_A, question3_B, question3_C, question3_D, 3);
        }
        else {
            question3_A.setOnClickListener(v -> question3.setText(question3_text + " | A is incorrect"));
            question3_B.setOnClickListener(v -> question3.setText(question3_text + " | B is incorrect"));
            question3_C.setOnClickListener(v -> correct(question3_text, 'C', question3, 75, question3_A, question3_B, question3_C, question3_D, 3));
            question3_D.setOnClickListener(v -> question3.setText(question3_text + " | D is incorrect"));
        }
        if (Values.question8){
            correct(question4_text, 'D', question4, 100, question4_A, question4_B, question4_C, question4_D, 4);
        }
        else{
            question4_A.setOnClickListener(v -> question4.setText(question4_text + " | A is incorrect"));
            question4_B.setOnClickListener(v -> question4.setText(question4_text + " | B is incorrect"));
            question4_C.setOnClickListener(v -> question4.setText(question4_text + " | C is incorrect"));
            question4_D.setOnClickListener(v -> correct(question4_text, 'D', question4, 100, question4_A, question4_B, question4_C, question4_D, 4));
        }
    }

    // When question is correct, do these things
    void correct(String text, char ch, TextView question, int num, TextView A, TextView B, TextView C, TextView D, int key){
        String set = text + " | " + ch + " is correct";
        question.setText(set);
        MainActivity.check3(num);
        A.setClickable(false);
        B.setClickable(false);
        C.setClickable(false);
        D.setClickable(false);

        // Sets boolean in values to save info when leaving the page
        switch (key){
            case 1:
                Values.question5 = true;
                break;
            case 2:
                Values.question6 = true;
                break;
            case 3:
                Values.question7 = true;
                break;
            case 4:
                Values.question8 = true;
                break;
        }
    }
}