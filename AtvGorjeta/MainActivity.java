package com.example.atv_gorjeta;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import com.example.atv_gorjeta.R;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBarPessoas;

    private SeekBar seekBarGorjeta;
    private TextView pessoas;

    private TextView gorjet;
    private EditText valorConta;
    private int numPessoas;
    private int valorGorjeta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoas = findViewById(R.id.numPessoas);
        gorjet = findViewById(R.id.valorGorjeta);
        seekBarPessoas = findViewById(R.id.seekBarPessoas);
        seekBarPessoas.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                numPessoas = progress;
                pessoas.setText("Números de Pessoas: " + numPessoas);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                numPessoas = seekBar.getProgress();
                pessoas.setText("Números de Pessoas: " + numPessoas);
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                numPessoas = seekBar.getProgress();
                pessoas.setText("Números de Pessoas: " + numPessoas);
            }
        });
        seekBarGorjeta = findViewById(R.id.seekBarGorjeta);
        seekBarGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                valorGorjeta = progress;
                gorjet.setText("Porcentagem da Gorjeta: " + valorGorjeta);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                valorGorjeta = seekBar.getProgress();
                gorjet.setText("Porcentagem da Gorjeta: " + valorGorjeta);
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                valorGorjeta = seekBar.getProgress();
                gorjet.setText("Porcentagem da Gorjeta: " + valorGorjeta);
            }
        });
    }
    public void calcValor(View view){
        valorConta = findViewById(R.id.valorConta);
        double valorgorjet = valorGorjeta;
        double valor = Double.parseDouble(valorConta.getText().toString());
        double valorIndividual = valor/numPessoas;
        double indivGorj = valorIndividual+(valorIndividual*(valorgorjet/100));
        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle("Gorjeta: ");
        alerta.setMessage("Aperte 'CG' para ver o valor individual com a gorjeta e 'SG' se quiser ver com a gorjeta");
        alerta.setPositiveButton("CG", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        String.format("Valor individual com a gorjeta: R$%.2f",indivGorj),
                        Toast.LENGTH_SHORT).show();
            }
        });
        alerta.setNegativeButton("SG", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),
                        String.format("Valor individual sem gorjeta: R$%.2f",valorIndividual),
                        Toast.LENGTH_SHORT).show();
            }
        });
        alerta.create();
        alerta.show();
    }
}
