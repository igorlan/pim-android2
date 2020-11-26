package com.igorunip.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Menu extends AppCompatActivity {


    EditText edUser, etPass;
    Button btnLogIn;

    public static SharedPreferences prefs;
    public String prefName = "MyPref";
    public static final String TEXT_VALUE_KEY = "nothing";
    //-----

    public static String Password="123";
    public static String getPassword()
    {
        return Password;
    }




    public void irParaRecuperacao(View view){
        Intent intent2 = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intent2);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        final GlobalClass globalClass = (GlobalClass) getApplicationContext();

        edUser = (EditText) findViewById(R.id.editTextTextEmailAddress);
        etPass = (EditText) findViewById(R.id.editTextTextPassword);
        btnLogIn = (Button) findViewById(R.id.button9);




        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edUser.getText().toString().equals(""+globalClass.getLoginIgor()) && etPass.getText().toString().equals(""+getPassword())) {

                    globalClass.setName("Igor Lansarotto");
                    globalClass.setSaldo("BTC 0,0154");
                    globalClass.setSaldoReal("R$ 1.305,31");
                    globalClass.setLogin("Ontem");
                    globalClass.setUFIgor("SP");
                    globalClass.setEstadoIgor("São Paulo");
                    globalClass.setCEPIgor("04469-123");
                    globalClass.setComplementoIgor("Casa");
                    globalClass.setRuaIgor("Rua Domingos Borges");
                    globalClass.setEmailIgor("igor.lansarotto@gmail.com");
                    globalClass.setDDDcelularIgor("11");
                    globalClass.setDDDResidencialIgor("11");
                    globalClass.setcelularIgor("11984271212");
                    globalClass.setResidencialIgor("1125062484");


                    Toast.makeText(getApplicationContext(), "Logado como:"+globalClass.getName(), Toast.LENGTH_LONG).show();
                    Intent myintent = new Intent(Menu.this, MainActivity2.class);
                    startActivity(myintent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Login Invalido", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
