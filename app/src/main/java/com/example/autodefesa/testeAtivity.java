package com.example.autodefesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return  true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id  = item.getItemId();
      if(id == R.id.action_settings){
//            Toast.makeText(this,"Clicou no Settings!",Toast.LENGTH_SHORT).show();
          Intent janela = new Intent(this,agenda.class);
          startActivity(janela);
//            return true;
        }
        return  super.onOptionsItemSelected(item);

    }


}

