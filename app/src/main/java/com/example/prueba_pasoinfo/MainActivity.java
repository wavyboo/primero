package com.example.prueba_pasoinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView texto;
    public EditText nombre;
    public Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.idNombre);
        boton = findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String n = nombre.getText().toString();

                Intent intent = new Intent(MainActivity.this, ma.class);
                intent.putExtra("nombre", n);
                startActivity(intent);

            }
        });
    }
}


