package com.example.aulacheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxVerde;
    private CheckBox checkBoxAzul;
    private CheckBox checkBoxVermelho;
    private TextView textoResult;
    private RadioButton radioButtonArroz;
    private RadioButton radioButtonFeijao;
    private RadioGroup radioGroupAlmoco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxVerde = findViewById(R.id.checkBoxVerde);
        checkBoxAzul = findViewById(R.id.checkBoxAzul);
        checkBoxVermelho = findViewById(R.id.checkBoxVermelho);
        textoResult = findViewById(R.id.textoResult);
        radioButtonArroz = findViewById(R.id.radioButtonArroz);
        radioButtonFeijao = findViewById(R.id.radioButtonFeijao);
        radioGroupAlmoco = findViewById(R.id.radioGroupAlmoco);
        radioButtonListener();
    }

    public void radioButton(){
        if(radioButtonArroz.isChecked()){
            textoResult.setText("Arroz");
        }else if(radioButtonFeijao.isChecked()){
            textoResult.setText("Feijão");
        }
    }

    public void checkbox(){

        String texto="";
        if(checkBoxVerde.isChecked()){
            texto = "Verde selecionado";
        }if(checkBoxAzul.isChecked()){
            texto += " / Azul selecionado";
        }if(checkBoxVermelho.isChecked()){
            texto += " / Vermelho selecionado";
        }

        textoResult.setText(texto);
    }

    public void radioButtonListener(){
        radioGroupAlmoco.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButtonArroz){
                    textoResult.setText("Arroz");
                }else if(checkedId == R.id.radioButtonFeijao){
                    textoResult.setText("Feijão");
                }
            }
        });
    }

    public void enviar(View view){
        //checkbox();
        //radioButton();
    }
}
