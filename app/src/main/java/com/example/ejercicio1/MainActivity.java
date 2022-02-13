package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1,num2;
    private TextView resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);

        Button suma  =(Button) findViewById(R.id.btnSuma);
        Button resta =(Button) findViewById(R.id.btnResta);
        Button mult  =(Button) findViewById(R.id.btnMulti);
        Button div   =(Button) findViewById(R.id.btnDivision);
        final TextView result= findViewById(R.id.result);

        //suma
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1= new Float(num1.getText().toString());
                float n2= new Float(num2.getText().toString());
                result.setText("Resultado: " + (n1+n2));
            }
        });

        //resta
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1= new Float(num1.getText().toString());
                float n2= new Float(num2.getText().toString());
                result.setText("Resultado: " + (n1-n2));
            }
        });

        //Multiplicacion
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1= new Float(num1.getText().toString());
                float n2= new Float(num2.getText().toString());
                result.setText("Resultado: " + (n1*n2));
            }
        });

        //Division
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1= new Float(num1.getText().toString());
                float n2= new Float(num2.getText().toString());
                result.setText("Resultado: " + (n1/n2));
            }
        });
    }
}