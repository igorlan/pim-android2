package com.igorunip.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class AlterarEmail extends AppCompatActivity {



    public void Voltar(View view){
        Intent intent1 = new Intent(getApplicationContext(), MainActivity5.class);
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_email);
        final GlobalClass globalClass = (GlobalClass) getApplicationContext();
        Button button2 = findViewById(R.id.button98);
        final TextView email = findViewById(R.id.txtEndereco);
        email.setText(globalClass.getEmailIgor());


        Button button = findViewById(R.id.button);


        TextView name = findViewById(R.id.textUsuarioAlterar);
        TextView saldo = findViewById(R.id.textSaldo9);
        TextView saldoReal = findViewById(R.id.textSaldoReal9);
        TextView login = findViewById(R.id.textLogin9);
        TextView login2 = findViewById(R.id.textUsuario9);


        name.setText(globalClass.getName());
        saldo.setText(globalClass.getSaldo());
        saldoReal.setText(globalClass.getSaldoReal());
        login.setText(globalClass.getLogin());
        login2.setText(globalClass.getName());

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit = (EditText)findViewById(R.id.editTextTextPersonName6);
                TextView tview = (TextView)findViewById(R.id.txtEndereco);
                String result = edit.getText().toString();
                tview.setText(result);
                globalClass.setEmailIgor(""+result);
            }
        });

        final EditText editaremail = findViewById(R.id.editTextTextPersonName6);

        ImageView Erro = findViewById(R.id.imageView47);
        ImageView Acerto= findViewById(R.id.imageView48);
        Erro.setVisibility(View.GONE);
        Acerto.setVisibility(View.GONE);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                validaremail(editaremail);
            }
        });

        }

        private boolean validaremail(EditText emailid){

        String emailinput = emailid.getText().toString();
            ImageView Erro = findViewById(R.id.imageView47);
            ImageView Acerto= findViewById(R.id.imageView48);
            Button button2 = findViewById(R.id.button98);
            Erro.setVisibility(View.GONE);
            Acerto.setVisibility(View.GONE);
            GlobalClass globalClass = (GlobalClass) getApplicationContext();
            final TextView email = findViewById(R.id.txtEndereco);
            email.setText(globalClass.getEmailIgor());

        if(!emailinput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailinput).matches()){
            Acerto.setVisibility(View.VISIBLE);
            Erro.setVisibility(View.GONE);
            Toast.makeText(this, "Email valido!", Toast.LENGTH_SHORT).show();
            button2.setEnabled(true);
            return true;
            }else{
            Erro.setVisibility(View.VISIBLE);
            Acerto.setVisibility(View.GONE);
            Toast.makeText(this, "Email invalido!", Toast.LENGTH_SHORT).show();
            return false;
        }


    }





}