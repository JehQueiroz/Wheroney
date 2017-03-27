package br.edu.iff.pooa20161.appwheroney.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import br.edu.iff.pooa20161.appwheroney.R;

public class Saque extends AppCompatActivity {
    Button sqSalvar;
    Spinner categoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saque);

        sqSalvar=(Button)findViewById(R.id.sqSalvar);

        sqSalvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent saq = new Intent(Saque.this, Wheroney.class);
                startActivity(saq);
                finish();
            }
        });
        categoria = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter adapter =
                ArrayAdapter.createFromResource(this,R.array.categorias,R.layout.support_simple_spinner_dropdown_item);
        categoria.setAdapter(adapter);

    }
}
