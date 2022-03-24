package com.example.autodefesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class testeAtivity extends AppCompatActivity  implements View.OnClickListener{
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btnIniciar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent janela = new Intent(this,ItemListActivity.class);
        startActivity(janela);
    }
}

