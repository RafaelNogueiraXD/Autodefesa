package com.example.autodefesa;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class agenda extends AppCompatActivity {
    public EditText tv_filter;
    public TextView mostraAtividade;
    public TextView mostraData;
    public EditText inputAtividade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        inputAtividade = (EditText) findViewById(R.id.inputAtividade);

        mostraAtividade = (TextView) findViewById(R.id.mostraAtividade);
        mostraData =(TextView) findViewById(R.id.mostraData);

        inputAtividade.addTextChangedListener(fieldValidatorTextWatcher);
    }

    TextWatcher fieldValidatorTextWatcher = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {

        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (filterLongEnough()) {
//                populateList();
            }
            String pegaAtv = inputAtividade.getText().toString();

            mostraAtividade.setText(pegaAtv);
            DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            mostraData.setText(dtf4.format(LocalDateTime.now()));
//            recebeTexto = tv_filter.getText().toString();
        }

        private boolean filterLongEnough() {
            return mostraAtividade.getText().toString().trim().length() > 2;
        }
    };
}