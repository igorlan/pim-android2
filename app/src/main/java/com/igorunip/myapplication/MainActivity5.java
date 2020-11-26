package com.igorunip.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

       final GlobalClass globalClass = (GlobalClass) getApplicationContext();
        TextView name = findViewById(R.id.textUsuario9);
        TextView saldo = findViewById(R.id.textSaldoMenuAlterar);
        TextView saldoReal = findViewById(R.id.textSaldoReal2);
        TextView login = findViewById(R.id.textLogin9);
        TextView login2 = findViewById(R.id.textUsuarioLogadoMenuAlterar);





        saldoReal.setText(globalClass.getSaldoReal());
        name.setText(globalClass.getName());
        saldo.setText(globalClass.getSaldo());
        login.setText(globalClass.getLogin());
        login2.setText(globalClass.getName());
    }

    public void irAlterarPerfil(View view){
        Intent intent6 = new Intent(getApplicationContext(), Menu.class);
        startActivity(intent6);
    }

    public void irParaTela2(View view){
        Intent intent1 = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent1);
    }

    public void IrParaAlterarEndereco(View view){
        Intent intent2 = new Intent(getApplicationContext(), MainActivity9.class);
        startActivity(intent2);
    }

    public void IrParaAlterarEmail(View view){
        Intent intent3 = new Intent(getApplicationContext(), AlterarEmail.class);
        startActivity(intent3);
    }

    public void IrParaAlterarSenha(View view){
        Intent intent4 = new Intent(getApplicationContext(), AlterarSenha.class);
        startActivity(intent4);
    }

    public void IrParaAlterarTelefone(View view){
        Intent intent5 = new Intent(getApplicationContext(), AlterarTelefone.class);
        startActivity(intent5);
    }
    public void irCarteira(View view){
        Intent intent6 = new Intent(getApplicationContext(), Carteira.class);
        startActivity(intent6);
    }


}