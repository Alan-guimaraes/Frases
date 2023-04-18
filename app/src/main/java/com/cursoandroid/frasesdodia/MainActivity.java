package com.cursoandroid.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Seja a mudança que você quer ver no mundo.",
                "A vida é como andar de bicicleta. Para ter equilíbrio, você tem que se manter em movimento.",
                "O dinheiro faz homens ricos, o conhecimento faz homens sábios e a humildade faz grandes homens.",
                "Bons amigos são como estrelas: nem sempre podemos ver, mas temos certeza que estão sempre lá.",
                "Nada é aleatório"
        };
        int numero = new Random().nextInt(5);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases[numero] );

    }

}
