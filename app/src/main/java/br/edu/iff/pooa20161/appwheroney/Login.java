package br.edu.iff.pooa20161.appwheroney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button btCadastrar, btLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btCadastrar=(Button)findViewById(R.id.btCadastrar);

        btCadastrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cadConta = new Intent(Login.this, CadastrarConta.class);
                startActivity(cadConta);
                finish();
            }
        });

         btLogin=(Button)findViewById(R.id.btLogin);

        btLogin.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
                Intent log = new Intent(Login.this, Wheroney.class);
            startActivity(log);
            finish();
              }
        });

    }
}
