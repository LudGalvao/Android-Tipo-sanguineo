package com.example.tipossanguineo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionButton(View v) {
        EditText etT = findViewById(R.id.editTextText);
        TextView etR = findViewById(R.id.idN);

        String t = etT.getText().toString().toUpperCase();

        try {
            Integer.parseInt(t);
            etR.setText("Apenas String");
        } catch (NumberFormatException e) {
            tiposSangue.TipoSangue tipoSangue = new tiposSangue().new TipoSangue();
            String resposta = tipoSangue.pesquisa(t);
            etR.setText(resposta);
        }
    }
}
