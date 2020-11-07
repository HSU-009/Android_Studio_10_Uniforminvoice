package com.example.android_studio_10_uniforminvoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(button1_click);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(button2_click);

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(button3_click);

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(button4_click);

        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(button5_click);

        Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(button6_click);
    }
    private View.OnClickListener button1_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            TextView text = (TextView)findViewById(R.id.textview2);
            TextView textview3= (TextView)findViewById(R.id.textview3);
            text.setText("2018 1,2月發票");
            textview3.setText("1");
        }
    };
    private View.OnClickListener button2_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_2 = (TextView)findViewById(R.id.textview2);
            TextView textview3 = (TextView)findViewById(R.id.textview3);
            text_2.setText("2018 3,4月發票");
            textview3.setText("2");
        }
    };
    private View.OnClickListener button3_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_3 = (TextView)findViewById(R.id.textview2);
            TextView textview3 = (TextView)findViewById(R.id.textview3);
            text_3.setText("2018 5,6月發票");
            textview3.setText("3");
        }
    };
    private View.OnClickListener button4_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_4 = (TextView)findViewById(R.id.textview2);
            TextView textview3 = (TextView)findViewById(R.id.textview3);
            text_4.setText("2018 7,8月發票");
            textview3.setText("4");
        }
    };
    private View.OnClickListener button5_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_5 = (TextView)findViewById(R.id.textview2);
            TextView textview3 = (TextView)findViewById(R.id.textview3);
            text_5.setText("2018 9,10月發票");
            textview3.setText("5");
        }
    };
    private View.OnClickListener button6_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_6 = (TextView)findViewById(R.id.textview2);
            TextView textview3= (TextView)findViewById(R.id.textview3);
            text_6.setText("2018 11,12月發票");
            textview3.setText("6");
        }
    };
    public void button7(View v){
        TextView button = (TextView)findViewById(R.id.textview2);
        TextView textview3 = (TextView)findViewById(R.id.textview3);
        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("mouth", button.getText().toString());
        bundle.putString("numberMouth", textview3.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}