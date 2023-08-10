package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

import android.os.Bundle;

import com.example.recyclerview.adapter.Adapter;
import com.example.recyclerview.model.filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<filme> listaFilmes = new ArrayList<>();

    public void criarFilmes(){
        filme Filme= new filme("Homem Aranha", "Aventura", "2010");
        this.listaFilmes.add(Filme);
        filme Filme= new filme("Gente Grande", "Comedia", "2004");
        this.listaFilmes.add(Filme);
        filme Filme= new filme("Openheimer", "Drama", "2023");
        this.listaFilmes.add(Filme);
        filme Filme= new filme("Ratatouille", "Comédia", "2007");
        this.listaFilmes.add(Filme);
        filme Filme= new filme("Deadpool", "Ação", "2016");
        this.listaFilmes.add(Filme);
        filme Filme= new filme("Ready Player One", "Aventura", "2018");
        this.listaFilmes.add(Filme);
        filme Filme= new filme("O Livro de Eli", "Ação", "2010");
        this.listaFilmes.add(Filme);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //
        this.criarFilmes();

        //configurar adapter

        Adapter adapter = new Adapter();

        //configurar recylcerview

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter); //criar adapter
    }
}
