package com.example.applicatiolifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button result;
    Button Change;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        result=findViewById(R.id.buttonResult);
        Change = findViewById(R.id.buttonChange);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter+=1;
                textView.setText(""+counter);
            }
        });

        Change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),Second_activity.class);
                startActivity(intent);
            }
        });
        Log.d("message","firstAcitivity OnCrete");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("message","firtsAcitivity Onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("message","firtsAcitivity OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("message","firtsAcitivity OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("message","firtsAcitivity Onstop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message","firtsAcitivity OnDestory");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message","firtsAcitivity OnRestart");
    }
}