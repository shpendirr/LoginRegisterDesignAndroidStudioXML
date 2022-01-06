package com.example.loginsignup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Calendar;

public class Signup extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    TextView time_msg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        constraintLayout = findViewById(R.id.container2);

        time_msg2 = findViewById(R.id.time_msg2);

        Calendar c = Calendar.getInstance();

        int timeofDay = c.get(Calendar.HOUR_OF_DAY);

        if (timeofDay >= 0 && timeofDay < 12 ){
            // morning
            constraintLayout.setBackground(getDrawable(R.drawable.good_morning_img));
            time_msg2.setText("Good Morning");
        }
        else if (timeofDay >= 12 && timeofDay < 16) {
            // afternoon

        }
        else if (timeofDay >= 16 && timeofDay < 19){
            //evening
        } else if (timeofDay >= 20 && timeofDay < 24){
            // night
            constraintLayout.setBackground(getDrawable(R.drawable.good_night_img));
            time_msg2.setText("Good Night");
        }

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }
}