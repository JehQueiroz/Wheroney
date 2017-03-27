package br.edu.iff.pooa20161.appwheroney.Model;

import com.orm.SugarRecord;

import java.util.ArrayList;

/**
 * Created by Jessica on 26/03/2017.
 */
public class CategoriaModel extends SugarRecord {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaModel(String nome)
    {
        this.nome = nome;
    }

}
