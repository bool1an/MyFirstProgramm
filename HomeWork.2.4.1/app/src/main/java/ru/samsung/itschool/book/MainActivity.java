package ru.samsung.itschool.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void run(View v) {
        EditText a = findViewById(R.id.a);
        String strA = a.getText().toString();
        int numA = Integer.parseInt(strA);

        EditText b = findViewById(R.id.b);
        String strB = b.getText().toString();
        int numB = Integer.parseInt(strB);

        EditText c = findViewById(R.id.c);
        String strC = c.getText().toString();
        int numC = Integer.parseInt(strC);
    }


}
