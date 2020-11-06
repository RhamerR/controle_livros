package com.example.controle_livros;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class MainActivity extends AppCompatActivity {


    private FirebaseFirestore firebaseFirestore;
    private RecyclerView mFirestoreList;

    private FirestoreRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nomeParaOBotao = (Button) findViewById(R.id.chamar_cadastro_livro);

        // CHAMAR TELA DE CADASTRO
        nomeParaOBotao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, cadastro_livro.class);
                startActivity(it);
            }
        });


        firebaseFirestore = FirebaseFirestore.getInstance();
        mFirestoreList = findViewById(R.id.firestore_list);


        // QUERY

        Query query = firebaseFirestore.collection("Livro");

        // Reclycle Options
        FirestoreRecyclerOptions<livros> options = new FirestoreRecyclerOptions.Builder<livros>()
                .setQuery(query, livros.class)
                .build();
        adapter = new FirestoreRecyclerAdapter<livros, livrosViewHolder>(options) {
            @NonNull
            @Override
            public livrosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_livro, parent, false);



                return new livrosViewHolder(view);
            }

            @Override
            protected void onBindViewHolder(@NonNull livrosViewHolder livrosViewHolder, int i, @NonNull livros livros) {

                livrosViewHolder.list_nome.setText(livros.getNome());
                livrosViewHolder.list_autor.setText(livros.getAutor());

            }
        };

        mFirestoreList.setHasFixedSize(true);
        mFirestoreList.setLayoutManager(new LinearLayoutManager(this));
        mFirestoreList.setAdapter(adapter);

    }


    private class livrosViewHolder extends RecyclerView.ViewHolder{

        private TextView list_nome;
        private TextView list_autor;

        public livrosViewHolder(@NonNull View itemView) {
            super(itemView);

            list_nome = itemView.findViewById(R.id.list_nome);
            list_autor = itemView.findViewById(R.id.list_autor);

        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }
}