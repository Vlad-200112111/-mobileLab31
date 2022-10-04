package com.example.lab31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickButton(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "CONTENT CONTENT CONTENT CONTENT CONTENT CONTENT",
                Toast.LENGTH_LONG);
        myToast.show();
    }

    public void OnClickButton2(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "CONTENT2 CONTENT2 CONTENT2 CONTENT2 CONTENT2 CONTENT2",
                Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.TOP, 0, 0);
        myToast.show();
    }
}