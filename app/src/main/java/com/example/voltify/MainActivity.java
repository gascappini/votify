package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText durata;
    EditText autore;
    EditText datauscita;
    Button btnInserisci;
    Button btnApri;
EditText txtTitolo;
Gestorebrani gb;
Spinner spGeneri;
String[] generi = {"Pop", "Trap", "Rap", "Dance"};
ArrayAdapter<String> aaG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gb= new Gestorebrani();
        txtTitolo = (EditText)findViewById(R.id.txtTitolo);
        durata = (EditText)findViewById(R.id.txtDurata);
        autore = (EditText)findViewById(R.id.txtAutore);
        datauscita = (EditText)findViewById(R.id.txtDatauscita);
        btnInserisci = (Button)findViewById(R.id.btnInserisci);
        btnApri = (Button)findViewById(R.id.btnApri);
        spGeneri=(Spinner)findViewById(R.id.spGeneri);
        aaG= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, generi);
        spGeneri.setAdapter(aaG);

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String genSelezionato = spGeneri.getSelectedItem().toString();
                gb.addBrano(txtTitolo.getText().toString(),Integer.parseInt(durata.getText().toString()),autore.getText().toString(), datauscita.getText().toString(), spGeneri.getSelectedItem().toString());

            }
        });


        btnApri.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick (View v)
            {
                StringBuilder stringa = new StringBuilder();
                stringa = gb.listaBrani();
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("stringa",stringa.toString());
                startActivity(i);
            }
        });


    }
}