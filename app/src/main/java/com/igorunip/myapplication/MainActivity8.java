package com.igorunip.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        GlobalClass globalClass = (GlobalClass) getApplicationContext();

        TextView name = findViewById(R.id.textUsuario9);
        TextView saldo = findViewById(R.id.textSaldo9);
        TextView saldoReal = findViewById(R.id.textSaldoReal9);
        TextView login = findViewById(R.id.textLogin9);
        TextView login2 = findViewById(R.id.textUsuario4);





        saldoReal.setText(globalClass.getSaldoReal());
        name.setText(globalClass.getName());
        saldo.setText(globalClass.getSaldo());
        login.setText(globalClass.getLogin());
        login2.setText(globalClass.getName());
    }

    public void Voltar(View view){
        Intent intent3 = new Intent(getApplicationContext(), MainActivity6.class);
        startActivity(intent3);
    }
}