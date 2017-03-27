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
import java.util.List;

import br.edu.iff.pooa20161.appwheroney.Adapter.DepositoAdapter;
import br.edu.iff.pooa20161.appwheroney.Model.DepositoModel;
import br.edu.iff.pooa20161.appwheroney.R;

public class ListaDeposito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_proprietario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListaDeposito.this, Deposito.class);
                intent.putExtra("id",0);
                intent.putExtra("quantia","");
                intent.putExtra("categoria","");
                intent.putExtra("data","");
                intent.putExtra("descricao","");
                startActivity(intent);


            }
        });

    }

    protected void onResume()
    {
        super.onResume();
        ListView lista = (ListView) findViewById(R.id.tlvProp);

        final ArrayList<DepositoModel> dep = (ArrayList<DepositoModel>)
                DepositoModel.listAll(DepositoModel.class);

        ArrayAdapter adapter = new DepositoAdapter(this, dep);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListaDeposito.this, Deposito.class);
                intent.putExtra("id", dep.get(i).getId().intValue());
                intent.putExtra("quantia", dep.get(i).getQuantia());
                intent.putExtra("categoria", dep.get(i).getCategoria());
                intent.putExtra("data", dep.get(i).getData());
                intent.putExtra("descricao", dep.get(i).getDescricao());

                startActivity(intent);

            }
        });


    }

}