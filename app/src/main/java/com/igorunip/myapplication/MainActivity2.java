package com.igorunip.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        GlobalClass globalClass = (GlobalClass) getApplicationContext();
        TextView name = findViewById(R.id.textUsuario9);
        TextView saldo = findViewById(R.id.textSaldo9);
        TextView saldoReal = findViewById(R.id.textSaldoReal9);
        TextView login = findViewById(R.id.textLogin9);

        name.setText(globalClass.getName());
        saldo.setText(globalClass.getSaldo());
        saldoReal.setText(globalClass.getSaldoReal());
        login.setText(globalClass.getLogin());


    }

    public void irAlterarPerfil(View view){
        Intent intent6 = new Intent(getApplicationContext(), MainActivity5.class);
        startActivity(intent6);
    }


      public void irParaLogin(View view){
        Intent intent0 = new Intent(getApplicationContext(), Menu.class);
        startActivity(intent0);
    }

    public void irParaSimular(View view){
        Intent intent0 = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(intent0);
    }
    public void irParaCripto(View view){
        Intent intent3 = new Intent(getApplicationContext(), MainActivity6.class);
        startActivity(intent3);
    }

    public void irCarteira(View view){
        Intent intent4 = new Intent(getApplicationContext(), Carteira.class);
        startActivity(intent4);
    }




}