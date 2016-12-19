     Button btSalvar;
        btSalvar=(Button)findViewById(R.id.btSalvar);
          btSalvar.setOnClickListener(new View.OnClickListener(){
         @Override
        public void onClick(View v){
             Intent cadConta = new Intent(CadastrarConta.this, Wheroney.class);
            startActivity(cadConta);
            finish();
                 }
          });
