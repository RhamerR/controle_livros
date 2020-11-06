package com.example.controle_livros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.controle_livros.classes.livros;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class cadastro_livro extends AppCompatActivity {

    EditText edit_nome, edit_titulo, edit_autor, edit_quantidade;

    FirebaseDatabase firebasedatabase;
    DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_livro);

        // PEGAR DADOS ESCRITOS

        edit_nome = (EditText)findViewById(R.id.cadastro_nome);
        edit_titulo = (EditText)findViewById(R.id.cadastro_titulo);
        edit_autor = (EditText)findViewById(R.id.cadastro_autor);
        edit_quantidade = (EditText)findViewById(R.id.cadastro_paginas);

        inicializarBD();
    }

    // iniciar BD
    private void inicializarBD (){
        FirebaseApp.initializeApp(cadastro_livro.this);
        firebasedatabase = FirebaseDatabase.getInstance();
        databaseReference = firebasedatabase.getReference();

    }

    public void salvar (View view){
        livros l = new livros();
        l.setID(UUID.randomUUID().toString());
        l.setNome(edit_nome.getText().toString());
        l.setTitulo(edit_titulo.getText().toString());
        l.setAutor(edit_autor.getText().toString());
        l.getQuantidade(Integer.parseInt(edit_quantidade.getText().toString()));
        databaseReference.child("Livro").child(l.getID()).setValue(l);


    }

    public void cancelar (View view){
        //faça algo
    }










}