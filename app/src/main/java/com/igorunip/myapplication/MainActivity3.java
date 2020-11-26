package com.igorunip.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    EditText edCpf, edAno;
    Button btnRecuperar;
    TextView textSua, textSenha;

        public void irParaLogin(View view){
            Intent intent0 = new Intent(getApplicationContext(), Menu.class);
            startActivity(intent0);

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();

        edCpf = (EditText) findViewById(R.id.textCpf);
        edAno = (EditText) findViewById(R.id.textAno);
        btnRecuperar = (Button) findViewById(R.id.button2);

        textSenha = (TextView) findViewById(R.id.textView47);
        textSua = (TextView) findViewById(R.id.textRecuperar);


        btnRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textSua.setEnabled(false);
                textSenha.setEnabled(false);
                if (edCpf.getText().toString().equals(""+globalClass.getCpfIgor()) && edAno.getText().toString().equals(""+globalClass.getAno())) {

                    textSenha.setText("Sua senha é:");
                    textSenha.setEnabled(true);
                    textSua.setText(""+Menu.getPassword());
                    textSua.setEnabled(true);
                }
                else{
                    textSua.setText("");
                    textSenha.setText("Dados invalidos.");
                }
            }
        });
    }
}