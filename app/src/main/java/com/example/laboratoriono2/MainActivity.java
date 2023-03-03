package com.example.laboratoriono2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView peliculaTitulo;
    private TextView peliculaDescripcion;
    private ImageView peliculaImagen;
    private Button botonAterior;
    private  Button botonSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peliculaTitulo = (TextView)findViewById(R.id.Titulo_Pelicula);
        peliculaDescripcion = (TextView)findViewById(R.id.Descripcion_pelicula);
        peliculaImagen  = (ImageView)findViewById(R.id.Imagen_pelicula);
        botonAterior = (Button)findViewById(R.id.button);
        botonSiguiente = (Button)findViewById(R.id.button2);

        botonAterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                peliculaTitulo.setText(R.string.titulo_pelicula_text);
            }
        });{


        }

    }
}