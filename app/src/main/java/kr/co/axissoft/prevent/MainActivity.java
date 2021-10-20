package kr.co.axissoft.prevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button motion1 = findViewById(R.id.motion1);
        motion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(),MotionLayout_Ex1.class));
            }
        });

        Button motion2 = findViewById(R.id.motion2);
        motion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(),MotionLayout_Ex2.class));
            }
        });

        Button motion3 = findViewById(R.id.motion3);
        motion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(),MotionLayout_Ex3.class));
            }
        });
    }
}