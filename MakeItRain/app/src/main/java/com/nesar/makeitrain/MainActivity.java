package com.nesar.makeitrain;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    //    private Button showMoney;
//    private Button showTag;
    private TextView moneyText;
    private int moneyCounter = 0;

    private Button newButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        newButton = findViewById(R.id.button_make_rain);
//
//        newButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("New button", "onClick: Hola");
//            }
//        });


        moneyText = findViewById(R.id.money_text);
//        showMoney = findViewById(R.id.button_make_rain);
//        showTag = findViewById(R.id.button_show_tag);

//        showMoney.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("MYTAG", "onClick: Show Money");
//
//            }
//        });

    }

    public void showTag(View view) {
        Toast.makeText(getApplicationContext(), "Make it Rain", Toast.LENGTH_LONG)
                .show();
    }


    public void makeItRain(View v) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(); //$1,000.00

        moneyCounter += 1000;
        moneyText.setText(String.valueOf(numberFormat.format(moneyCounter)));

        //Get colors from our colors.xml resource.
        //moneyText.setTextColor(getResources().getColor(R.color.myColor));
        /*

         */

        moneyText.setTextColor(getResources().getColor(R.color.Nesar_blue));

        moneyText.setTextColor(Color.GREEN);

        switch (moneyCounter) {
            case 2000:
                moneyText.setTextColor(Color.BLUE);
                break;
            case 4000:
                moneyText.setTextColor(Color.YELLOW);
                break;
            default:
                break;


        }


    }
}
