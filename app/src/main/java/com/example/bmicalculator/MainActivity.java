 package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight,edtHeightFt,edtHeightIn;
        Button btnCalculate;
        TextView txtResult;

        edtWeight = findViewById(R.id.edtweight);
        edtHeightFt = findViewById(R.id.edtheightft);
        edtHeightIn = findViewById(R.id.edtheightin);

        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);

        btnCalculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                int weight = Integer.parseInt(edtWeight.getText().toString());
                int heightFt = Integer.parseInt(edtHeightFt.getText().toString());
                int heightIn = Integer.parseInt(edtHeightIn.getText().toString());

                int totalIn = heightFt* 12 + heightIn;
                double totalCm = totalIn*2.53;
                double totalM = totalCm/100;
                double bmi = weight/(totalM*totalM);

                if (bmi>25)
                {
                    txtResult.setText("You'r Overweoght");
                }else if (bmi>18)
                {
                    txtResult.setText("You'r Healthy");
                }else
                {
                    txtResult.setText("You'r Underweight");
                }


            }
        });

    }
}