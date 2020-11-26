package com.igorunip.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity9 extends AppCompatActivity {

    Button btnEnviar;

    public void Voltar(View view){
        Intent intent1 = new Intent(getApplicationContext(), MainActivity5.class);
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

       final GlobalClass globalClass = (GlobalClass) getApplicationContext();
        TextView name = findViewById(R.id.textUsuario19);
        TextView saldo = findViewById(R.id.textSaldo9);
        TextView saldoReal = findViewById(R.id.textSaldoReal9);
        TextView login = findViewById(R.id.textLogin9);
        TextView login2 = findViewById(R.id.textUsuarioLogadoAlterarEmail);

        name.setText(globalClass.getName());
        saldo.setText(globalClass.getSaldo());
        saldoReal.setText(globalClass.getSaldoReal());
        login.setText(globalClass.getLogin());
        login2.setText(globalClass.getName());



        TextView endereco = findViewById(R.id.txtEndereco);
        final TextView uf = findViewById(R.id.txtUF);
         TextView complemento = findViewById(R.id.txtComplemento);
         TextView cep = findViewById(R.id.txtCEP);
         TextView estado = findViewById(R.id.txtEstado);

        uf.setText(globalClass.getUFIgor());
        endereco.setText(globalClass.getRuaIgor());
        complemento.setText(globalClass.getComplementoIgor());
        cep.setText(globalClass.getCEPIgor());
        estado.setText(globalClass.getEstadoIgor());

        btnEnviar = (Button) findViewById(R.id.button98);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            GlobalClass globalClass = (GlobalClass) getApplicationContext();

            @Override
            public void onClick(View view) {

                EditText edit = (EditText)findViewById(R.id.editTextRua);
                TextView tview = (TextView)findViewById(R.id.txtEndereco);
                String result = edit.getText().toString();
                tview.setText(result);
                globalClass.setRuaIgor(""+result);

                EditText edit2 = (EditText)findViewById(R.id.editTextTextPersonName2);
                TextView tview2 = (TextView)findViewById(R.id.txtUF);
                String result2 = edit2.getText().toString();
                tview2.setText(result2);
                globalClass.setUFIgor(""+result2);

                EditText edit3 = (EditText)findViewById(R.id.editTextTextPersonName3);
                TextView tview3 = (TextView)findViewById(R.id.txtComplemento);
                String result3 = edit3.getText().toString();
                tview3.setText(result3);
                globalClass.setComplementoIgor(""+result3);

                EditText edit4 = (EditText)findViewById(R.id.editTextTextPersonName4);
                TextView tview4 = (TextView)findViewById(R.id.txtCEP);
                String result4 = edit4.getText().toString();
                tview4.setText(result4);
                globalClass.setCEPIgor(""+result4);

                EditText edit5 = (EditText)findViewById(R.id.editTextTextPersonName5);
                TextView tview5 = (TextView)findViewById(R.id.txtEstado);
                String result5 = edit5.getText().toString();
                tview5.setText(result5);
                globalClass.setEstadoIgor(""+result5);


            }
        });
    }
}