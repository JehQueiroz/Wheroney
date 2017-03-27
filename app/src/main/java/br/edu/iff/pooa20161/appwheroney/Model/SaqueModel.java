package br.edu.iff.pooa20161.appwheroney.Model;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Jessica on 26/03/2017.
 */
public class SaqueModel extends SugarRecord {

    private String descricao,quantia,data;
    ArrayList<CategoriaModel> categoria;

    public SaqueModel(String quantia, String data, String descricao)
    {
        this.quantia = quantia;
        this.data = data;
        this.descricao = descricao;
    }

    public String getQuantia() {
        return quantia;
    }

    public void setQuantia(String quantia) {
        this.quantia = quantia;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<CategoriaModel> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<CategoriaModel> categoria) {
        this.categoria = categoria;
    }
}
