package com.example.aula_alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialog(View view){
        androidx.appcompat.app.AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //configurar titulo e mensagem
        dialog.setTitle("Titúlo do dialogo");
        dialog.setMessage("mensagem do dialogo");

        //configurar açoes para sim e nâo
        dialog.setPositiveButton("sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Executar açâo ao clicar no botão sim", Toast.LENGTH_SHORT).show();

            }
        });

        dialog.setNegativeButton("nao", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Executar açâo ao clicar no botão não", Toast.LENGTH_SHORT).show();

            }
        });

        dialog.create();
        dialog.show();

    }
}
