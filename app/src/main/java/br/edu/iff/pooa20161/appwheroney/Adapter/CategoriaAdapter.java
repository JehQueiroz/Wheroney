package br.edu.iff.pooa20161.appwheroney.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.iff.pooa20161.appwheroney.Model.CategoriaModel;
import br.edu.iff.pooa20161.appwheroney.R;

/**
 * Created by Jessica on 26/03/2017.
 */
public class CategoriaAdapter extends ArrayAdapter<CategoriaModel> {
    private final Context context;
    private final ArrayList<CategoriaModel> categorias;

    public CategoriaAdapter(Context context, ArrayList<CategoriaModel>categorias)
    {
        super(context, R.layout.linha_categoria, categorias);
        this.context = context;
        this.categorias = categorias;
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.linha_categoria, parent, false);

        TextView nome = (TextView)rowView.findViewById(R.id.tv_nmcategoria);

        nome.setText(categorias.get(position).getNome());

        return rowView;
    }
}



