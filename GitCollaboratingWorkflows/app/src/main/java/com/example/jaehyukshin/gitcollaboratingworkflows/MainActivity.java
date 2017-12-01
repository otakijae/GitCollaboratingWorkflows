package com.example.jaehyukshin.gitcollaboratingworkflows;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber;
    EditText secondNumber;
    Button plusButton;
    Button minusButton;
    Button multiplyButton;
    Button divideButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText)findViewById(R.id.firstNumber);
        secondNumber = (EditText)findViewById(R.id.secondNumber);
        result = (TextView)findViewById(R.id.result);

        plusButton = (Button)findViewById(R.id.plusButton);
        minusButton = (Button)findViewById(R.id.minusButton);
        multiplyButton = (Button)findViewById(R.id.multiplyButton);
        divideButton = (Button)findViewById(R.id.divideButton);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MultiplyOperation();
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void MultiplyOperation(){
        int resultNumber = Integer.parseInt(firstNumber.getText().toString()) * Integer.parseInt(secondNumber.getText().toString());
        result.setText(Integer.toString(resultNumber));
    }
}