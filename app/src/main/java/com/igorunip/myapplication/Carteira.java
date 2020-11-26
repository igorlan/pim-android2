package com.igorunip.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Carteira extends AppCompatActivity {

    public void Voltar(View view){
        Intent intent1 = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carteira);


    }
}