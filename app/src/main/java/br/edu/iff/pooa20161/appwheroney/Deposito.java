package br.edu.iff.pooa20161.appwheroney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Deposito extends AppCompatActivity {
    Button dpSalvar;
    Spinner categoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposito);

        dpSalvar=(Button)findViewById(R.id.dpSalvar);

        dpSalvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent dep = new Intent(Deposito.this, Wheroney.class);
                startActivity(dep);
                finish();
            }
        });

        categoria = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter adapter =
                ArrayAdapter.createFromResource(this,R.array.categorias,R.layout.support_simple_spinner_dropdown_item);
        categoria.setAdapter(adapter);
    }
}
