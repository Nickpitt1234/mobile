package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        private Button butao;
        
        public static String texto,texto2;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                butao = findViewById(R.id.prossiga);

                butao.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                nextActivity();
                        }
                });
                EditText editText = findViewById(R.id.caixa1);
                texto = editText.getText().toString();
                EditText editText2 = findViewById(R.id.caixa2);
                texto2 = editText2.getText().toString();
        }
        public void nextActivity(){
                Intent intent = new Intent(this,MainActivity2.class);
                startActivity(intent);
        }
}