package com.example.aula19.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aula19.Fragment.ContatosFragment;
import com.example.aula19.Fragment.ConversasFragment;
import com.example.aula19.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversas, buttonContatos;

    private ContatosFragment contatosFragment;

    private ConversasFragment conversasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContatos = findViewById(R.id.buttonContatos);
        buttonConversas = findViewById(R.id.buttonConversas);

        conversasFragment = new ConversasFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameConteudo,conversasFragment);
        transaction.commit();

        buttonContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatosFragment);
                transaction.commit();
            }
        });

        buttonConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                conversasFragment = new ConversasFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                transaction.commit();

            }
        });
    }
}