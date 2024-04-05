package com.example.prueba_pasoinfo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ma extends AppCompatActivity {

    public TextView nom;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma);

        nom = findViewById(R.id.textView1);

        String nomb = getIntent().getStringExtra("nombre");

        // Mostrar el nombre en el TextView
       nom.setText(nomb);
    }
}
