package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnInserisci;
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
        btnInserisci = (Button)findViewById(R.id.btnInserisci);
        spGeneri=(Spinner)findViewById(R.id.spGeneri);
        aaG= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, generi);
        spGeneri.setAdapter(aaG);

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String genSelezionato = spGeneri.getSelectedItem().toString();
                gb.addBrano(txtTitolo.getText().toString(),spGeneri.getSelectedItem().toString());


            Toast.makeText(getApplicationContext(), genSelezionato, Toast.LENGHT_LONG).show();

            }


        });




    }
}