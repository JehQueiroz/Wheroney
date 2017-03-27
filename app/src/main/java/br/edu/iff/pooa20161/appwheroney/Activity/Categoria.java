package br.edu.iff.pooa20161.appwheroney.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.edu.iff.pooa20161.appwheroney.R;

public class Categoria extends AppCompatActivity {
    Button btAdicionar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);

        btAdicionar=(Button)findViewById(R.id.btAdicionar);

        btAdicionar.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v){
                  Intent cat = new Intent(Categoria.this, Wheroney.class);
              startActivity(cat);
              finish();
         }
         });

    }
}
