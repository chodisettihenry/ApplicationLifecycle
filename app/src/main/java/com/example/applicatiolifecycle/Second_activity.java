package com.example.applicatiolifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Second_activity extends AppCompatActivity {
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.buttonback);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentview= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentview);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("message","firtsAcitivity Onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("message","secondAcitivity OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("message","secondAcitivity OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("message","secondAcitivity Onstop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message","secondAcitivity OnDestory");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message","secondAcitivity OnRestart");
    }
}