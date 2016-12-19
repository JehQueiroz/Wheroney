package br.edu.iff.pooa20161.appwheroney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Wheroney extends AppCompatActivity {
    Button bt_saque, bt_deposito, btLancamento, btCategoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheroney);

        bt_saque=(Button)findViewById(R.id.btSaque);

        bt_saque.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent saq = new Intent(Wheroney.this, Saque.class);
                startActivity(saq);
                finish();
            }
        });

        bt_deposito=(Button)findViewById(R.id.bt_deposito);

        bt_deposito.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent depo = new Intent(Wheroney.this, Deposito.class);
                startActivity(depo);
                finish();
            }
        });

        btLancamento=(Button)findViewById(R.id.btLancamento);

        btLancamento.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent lan = new Intent(Wheroney.this, Lancamentos.class);
                startActivity(lan);
                finish();
            }
        });

        btCategoria=(Button)findViewById(R.id.btCategoria);

        btCategoria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cat = new Intent(Wheroney.this, Categoria.class);
                startActivity(cat);
                finish();
            }
        });
    }
}
