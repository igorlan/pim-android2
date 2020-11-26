package com.igorunip.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.text.InputType.TYPE_CLASS_TEXT;
import static android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD;
import static android.text.InputType.TYPE_TEXT_VARIATION_WEB_EDIT_TEXT;
import static android.text.InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD;
import static com.igorunip.myapplication.Menu.Password;
import static com.igorunip.myapplication.Menu.TEXT_VALUE_KEY;
import static com.igorunip.myapplication.Menu.getPassword;






public class AlterarSenha extends AppCompatActivity {

    public void Voltar(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
        startActivity(intent);
    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_senha);

       final GlobalClass globalClass = (GlobalClass) getApplicationContext();


        Button btnshow, btnalterar;
        final EditText senhaAntiga, senhaNova, confirmacaoSenha;

        TextView name = findViewById(R.id.textUsuario19);
        TextView saldo = findViewById(R.id.textSaldo9);
        TextView saldoReal = findViewById(R.id.textSaldoReal9);
        TextView login = findViewById(R.id.textLogin9);
        TextView login2 = findViewById(R.id.textUsuarioLogadoAlterarEmail);


        saldoReal.setText(globalClass.getSaldoReal());
        name.setText(globalClass.getName());
        saldo.setText(globalClass.getSaldo());
        login.setText(globalClass.getLogin());
        login2.setText(globalClass.getName());

        final TextView testarsenha = findViewById(R.id.testarsenha);

         testarsenha.setText(Password);

        btnshow = (Button) findViewById(R.id.button5);
        btnalterar = (Button) findViewById(R.id.button6);

        senhaAntiga = (EditText) findViewById(R.id.editTextTextPassword2);
        senhaNova = (EditText) findViewById(R.id.editTextTextPassword3);
        confirmacaoSenha = (EditText) findViewById(R.id.editTextTextPassword4);




       btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int inputType = senhaAntiga.getInputType();
                switch (inputType){
                    case (TYPE_CLASS_TEXT | TYPE_TEXT_VARIATION_WEB_EDIT_TEXT): {
                        senhaAntiga.setInputType(TYPE_TEXT_VARIATION_PASSWORD | TYPE_TEXT_VARIATION_WEB_PASSWORD);
                    }
                    break;
                    case (TYPE_TEXT_VARIATION_PASSWORD):{
                        senhaAntiga.setInputType(TYPE_CLASS_TEXT | TYPE_TEXT_VARIATION_WEB_EDIT_TEXT);
                    }
                    break;
                }

                senhaAntiga.setInputType(TYPE_CLASS_TEXT | TYPE_TEXT_VARIATION_WEB_EDIT_TEXT);
                senhaNova.setInputType(TYPE_CLASS_TEXT | TYPE_TEXT_VARIATION_WEB_EDIT_TEXT);
                confirmacaoSenha.setInputType(TYPE_CLASS_TEXT | TYPE_TEXT_VARIATION_WEB_EDIT_TEXT);




            }
        });



        btnalterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(confirmacaoSenha.getText().toString().equalsIgnoreCase("") |
                    senhaNova.getText().toString().equalsIgnoreCase("") |
                    senhaAntiga.getText().toString().equalsIgnoreCase(""))
            {
                Toast.makeText(getBaseContext(),"Preencha todos os campos", Toast.LENGTH_SHORT).show();
            }
            else
            if(!senhaNova.getText().toString().equalsIgnoreCase(confirmacaoSenha.getText().toString()))
            {
                Toast.makeText(getBaseContext(),
                        "As senhas não batem!", Toast.LENGTH_SHORT).show();
            }
            else
            if(!getPassword().equalsIgnoreCase(senhaAntiga.getText().toString()))
            {
                Toast.makeText(getBaseContext(),
                        "A senha atual está incorreta!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                ///------- //---save the values in the EditText view to preferences---
                Menu.prefs = getPreferences(MODE_PRIVATE);
                SharedPreferences.Editor editor = Menu.prefs.edit();
                editor.putString(TEXT_VALUE_KEY, senhaNova.getText().toString());
                //---saves the values---
                editor.commit();

                Password=senhaNova.getText().toString();
                Toast.makeText(getBaseContext(),
                        Password, Toast.LENGTH_SHORT).show();
            }

            }
        });


    }
}

