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
        EditText A = findViewById(R.id.a);
        String strA = A.getText().toString();
        double a = Double.parseDouble(strA);

        EditText B = findViewById(R.id.b);
        String strB = B.getText().toString();
        double b = Double.parseDouble(strB);

        EditText C = findViewById(R.id.c);
        String strC = C.getText().toString();
        double c = Double.parseDouble(strC);

        String value;
        String StrX1 = "none";
        String StrX2 = "none";
        double D = b * b - 4 * a * c;

        if (D > 0) {
           double x1 = (-b + Math.sqrt(D)) / (2 * a);
           StrX1 = Double.toString(x1);
           value = StrX1;
        }
        if (D >= 0) {
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            StrX2 = Double.toString(x2);
            value = StrX1 + " " + StrX2;
        } else {
            value = "none";
        }
        if (a == 0 && b == 0 && c == 0) {
            value = "any";
        }
        TextView textViewRes = findViewById(R.id.res);
        textViewRes.setText(value);
    }


}
