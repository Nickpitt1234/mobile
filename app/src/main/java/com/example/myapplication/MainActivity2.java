package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button butao;
    public static String text = MainActivity.texto;
    public static String text2 = MainActivity.texto2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        butao=findViewById(R.id.prossiga2);
        butao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity();
            }
        });
    }
    public void nextActivity(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}