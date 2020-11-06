package com.example.controle_livros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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



    }
}