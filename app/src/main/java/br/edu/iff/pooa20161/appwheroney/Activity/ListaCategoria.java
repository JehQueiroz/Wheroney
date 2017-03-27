package br.edu.iff.pooa20161.appwheroney.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.edu.iff.pooa20161.appwheroney.Adapter.CategoriaAdapter;
import br.edu.iff.pooa20161.appwheroney.Model.CategoriaModel;
import br.edu.iff.pooa20161.appwheroney.R;


public class ListaCategoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_categoria);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListaCategoria.this, CategoriaModel.class);
                intent.putExtra("id",0);
                intent.putExtra("nome","");
                startActivity(intent);


            }
        });

    }

    protected void onResume()
    {
        super.onResume();
        ListView lista = (ListView) findViewById(R.id.tlvProp);

        final ArrayList<CategoriaModel> cat = (ArrayList<CategoriaModel>)
                CategoriaModel.listAll(CategoriaModel.class);

        ArrayAdapter adapter = new CategoriaAdapter(this, cat);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListaCategoria.this, Categoria.class);
                intent.putExtra("id", cat.get(i).getId().intValue());
                intent.putExtra("nome", cat.get(i).getNome());
                startActivity(intent);

            }
        });


    }

}