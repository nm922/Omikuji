package com.example.owner.omikuji;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);
        Button omikujiButton = (Button) findViewById(R.id.omikuji);
        omikujiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                omikuji();
            }
        });
    }

    private void omikuji() {
        int number = new Random().nextInt() % 7;
            switch (number) {
                case 0:
                    result.setText(R.string.daikichi);
                    break;
                case 1:
                    result.setText(R.string.chukichi);
                    break;
                case 2:
                    result.setText(R.string.syokichi);
                    break;
                case 3:
                    result.setText(R.string.suekichi);
                    break;
                case 4:
                    result.setText(R.string.kichi);
                    break;
                case 5:
                    result.setText(R.string.kyou);
                    break;
                case 6:
                    result.setText(R.string.daikyou);
                    break;
            }
    }


}