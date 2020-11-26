package com.igorunip.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        GlobalClass globalClass = (GlobalClass) getApplicationContext();

        TextView name = findViewById(R.id.textUsuario3);
        TextView saldo = findViewById(R.id.textSaldo3);
        TextView saldoReal = findViewById(R.id.textSaldoReal3);
        TextView login = findViewById(R.id.textLogin3);
        TextView login2 = findViewById(R.id.textUsuario4);





        saldoReal.setText(globalClass.getSaldoReal());
        name.setText(globalClass.getName());
        saldo.setText(globalClass.getSaldo());
        login.setText(globalClass.getLogin());
        login2.setText(globalClass.getName());
    }
    public void irParaPaymentTokens(View view){
        Intent intent20 = new Intent(getApplicationContext(), MainActivity7.class);
        startActivity(intent20);
    }
    public void irParaMenu(View view) {
        Intent intent0 = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent0);
    }
    public void IrParaUtilityTokens(View view){
        Intent intent21 = new Intent(getApplicationContext(), MainActivity8.class);
        startActivity(intent21);
    }


}