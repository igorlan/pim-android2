package com.igorunip.myapplication;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

public class AlterarTelefone extends AppCompatActivity {

    public void Voltar(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
        startActivity(intent);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_telefone);



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


        TextView celularIgor = findViewById(R.id.textView82);
        final TextView ResidencialIgor = findViewById(R.id.textView100);



        final EditText celular = (EditText)findViewById(R.id.editTextNumber5);
        final EditText residencial = (EditText)findViewById(R.id.editTextNumber6);

        SimpleMaskFormatter ssaida1 = new SimpleMaskFormatter("(NN)NNNNN-NNNN");
        SimpleMaskFormatter ssaida2 = new SimpleMaskFormatter("(NN)NNNN-NNNN");
        MaskTextWatcher msaida1 = new MaskTextWatcher(celularIgor, ssaida1);
        MaskTextWatcher msaida2 = new MaskTextWatcher(ResidencialIgor, ssaida2);


        SimpleMaskFormatter entrada1 = new SimpleMaskFormatter("(NN)NNNNN-NNNN");
        SimpleMaskFormatter entrada2 = new SimpleMaskFormatter("(NN)NNNN-NNNN");
        MaskTextWatcher mentrada1 = new MaskTextWatcher(celular, ssaida1);
        MaskTextWatcher mentrada2 = new MaskTextWatcher(residencial, ssaida2);

        celular.addTextChangedListener(mentrada1);
        residencial.addTextChangedListener(mentrada2);
        celularIgor.addTextChangedListener(msaida1);
        ResidencialIgor.addTextChangedListener(msaida2);

        celularIgor.setText(globalClass.getcelularIgor());
        ResidencialIgor.setText(globalClass.getResidencialIgor());

        Button btnalterar = (Button) findViewById(R.id.button98);

        btnalterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(celular.getText().toString().equalsIgnoreCase("") |
                    residencial.getText().toString().equalsIgnoreCase(""))
            {
                Toast.makeText(getBaseContext(),"Preencha algum campo", Toast.LENGTH_SHORT).show();
            }
        else {
                EditText edit = (EditText) findViewById(R.id.editTextNumber5);
                TextView tview = (TextView) findViewById(R.id.textView82);
                String result = edit.getText().toString();
                tview.setText(result);
                globalClass.setcelularIgor("" + result);

                EditText edit2 = (EditText) findViewById(R.id.editTextNumber6);
                TextView tview2 = (TextView) findViewById(R.id.textView100);
                String result2 = edit2.getText().toString();
                tview2.setText(result2);
                globalClass.setResidencialIgor("" + result2);


            }
            }
            });
    }


}