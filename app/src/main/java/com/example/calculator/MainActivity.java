package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    TextView disp;
    float mValueOne, mValueTwo;

public void number(View view)
{   disp=findViewById(R.id.disp);
    button1 = findViewById(R.id.button1);
    button2 = findViewById(R.id.button2);
    button3 = findViewById(R.id.button3);
    button4 = findViewById(R.id.button4);
    button5 = findViewById(R.id.button5);
    button6 = findViewById(R.id.button6);
    button7 = findViewById(R.id.button7);
    button8 = findViewById(R.id.button8);
    button9 = findViewById(R.id.button9);

    button0 = findViewById(R.id.button0);
    button0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //  button0.getText().toString();
            Log.i("buttonis", button0.getText().toString());
            disp.setText(button0.getText().toString());

        }
    });
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //  button0.getText().toString();
            Log.i("buttonis", button1.getText().toString());
            disp.setText(button1.getText().toString());
        }
    });
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //  button0.getText().toString();
            Log.i("buttonis", button2.getText().toString());
            disp.setText(button2.getText().toString());
        }
    });
    button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //  button0.getText().toString();
            Log.i("buttonis", button3.getText().toString());
            disp.setText(button3.getText().toString());
        }
    });
    button4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //  button0.getText().toString();
            Log.i("buttonis", button4.getText().toString());
            disp.setText(button4.getText().toString());
        }
    });
    button5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //  button0.getText().toString();
            Log.i("buttonis", button5.getText().toString());
            disp.setText(button5.getText().toString());
        }
    });
    button6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //  button0.getText().toString();
            Log.i("buttonis", button6.getText().toString());
            disp.setText(button6.getText().toString());
        }
    });button7.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        //  button0.getText().toString();
        Log.i("buttonis", button7.getText().toString());
        disp.setText(button7.getText().toString());
    }
});
    button8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //  button0.getText().toString();
            Log.i("buttonis", button8.getText().toString());
            disp.setText(button8.getText().toString());
        }
    });
    button9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //  button0.getText().toString();
            Log.i("buttonis", button9.getText().toString());
            disp.setText(button9.getText().toString());
        }
    });





}












    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculation calculation=new Calculation();

      //  calculation.calculator()



    }
}
