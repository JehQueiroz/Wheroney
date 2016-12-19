package br.edu.iff.pooa20161.appwheroney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastrarConta extends AppCompatActivity {
     Button btSalvar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_conta);

        btSalvar=(Button)findViewById(R.id.btSalvar);

          btSalvar.setOnClickListener(new View.OnClickListener(){
         @Override
        public void onClick(View v){
             Intent cadConta = new Intent(CadastrarConta.this, Wheroney.class);
            startActivity(cadConta);
            finish();
                 }
          });
    }
}
