package com.igorunip.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity4 extends AppCompatActivity {
    SeekBar sb, sb2;
    TextView valuetxt, textovalor, textdinheiro, textSoma, textLCI;
    double prog1, prog2, soma, somacdb, somaLCI;


    public void irParaMenu(View view) {
        Intent intent0 = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        sb = this.findViewById(R.id.seekBar);
        sb2 = this.findViewById(R.id.seekBar2);
        textdinheiro = findViewById(R.id.textDinheiro);
        valuetxt = findViewById(R.id.textPeriodo);
        textSoma = findViewById(R.id.textSoma);
        textLCI = findViewById(R.id.textLCI);


        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                prog1=progress;

                valuetxt.setText("Período: " +progress+" Anos");

                if(progress==1){
                    valuetxt.setText("Período: "+ progress+" Ano");
                }
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }



        });

        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress2, boolean fromUser) {

                prog2=progress2*100;
                textdinheiro.setText("       Investidos: R$ " +((progress2++)*100+" Mensalmente"));



                if(progress2==0){
                    textdinheiro.setText("Total a ser investido: R$ "+ (progress2)*100);
                }
                soma=((((prog2)*12)*prog1));
                somacdb=soma+(soma*0.19);
                somaLCI=soma+(soma*0.16);
                textSoma.setText("Total: R$ "+somacdb);
                textLCI.setText("Total: R$"+somaLCI);
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }



        });




}}

