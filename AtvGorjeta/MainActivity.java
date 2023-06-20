package com.example.atv_gorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekbarPessoas;
    private SeekBar seekbarGorjeta;
    private EditText ValorConta;
    private TextView textResultado;
    private EditText editTextValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbarPessoas.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textResultado.setText("Pessoas: "+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                textResultado.setText("Pessoas: "+seekBar.getProgress());
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textResultado.setText("Pessoas: "+seekBar.getProgress());
            }
        });
    }



    public void CalcularConta(View view){
        textResultado = findViewById((R.id.textResultado));

        textResultado.setText("");

//        textResultado.setText("Valor sem Gooerjeta")
    }
}
