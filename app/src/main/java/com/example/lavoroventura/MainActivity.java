package com.example.lavoroventura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button bottone,                         //inizializzazione bottone

    ListView listas;
    String aStati[] = {"italia","francia","germania","Svizzera"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottone = (Button)findViewById(R.id.bottone);   //istanziare un ascoltatore
        bottone.setOnClickListener(this);

        listas=(ListView)findViewById(R.id.listastati);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,R.layout.activity_main,R.id.listastati,aStati);
        listas.setAdapter(aa);
    }
}