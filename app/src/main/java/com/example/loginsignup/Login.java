package com.example.loginsignup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Calendar;

public class Login extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    TextView  time_msg;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        constraintLayout = findViewById(R.id.container);

        time_msg = findViewById(R.id.time_msg);

        Calendar c = Calendar.getInstance();

        int timeofDay = c.get(Calendar.HOUR_OF_DAY);

        if (timeofDay >= 0 && timeofDay < 12 ){
            // morning
            constraintLayout.setBackground(getDrawable(R.drawable.good_morning_img));
            time_msg.setText("Good Morning");
        }
        else if (timeofDay >= 12 && timeofDay < 16) {
            // afternoon

        }
        else if (timeofDay >= 16 && timeofDay < 19){
            //evening
        } else if (timeofDay >= 20 && timeofDay < 24){
            // night
            constraintLayout.setBackground(getDrawable(R.drawable.good_night_img));
            time_msg.setText("Good Night");
        }

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        textView4 = findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Signup.class);
                startActivity(intent);
            }
        });
    }
}