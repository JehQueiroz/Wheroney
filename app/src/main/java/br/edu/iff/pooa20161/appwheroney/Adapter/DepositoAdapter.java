package br.edu.iff.pooa20161.appwheroney.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.iff.pooa20161.appwheroney.Model.DepositoModel;
import br.edu.iff.pooa20161.appwheroney.R;

/**
 * Created by Jessica on 26/03/2017.
 */
public class DepositoAdapter extends ArrayAdapter<DepositoModel> {
    private final Context context;
    private final ArrayList<DepositoModel> depositos;

    public DepositoAdapter(Context context, ArrayList<DepositoModel>depositos)
    {
        super(context, R.layout.linha_depositos, depositos);
        this.context = context;
        this.depositos = depositos;
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.linha_depositos, parent, false);

        TextView quantia = (TextView)rowView.findViewById(R.id.tvllQuantia);
        TextView data = (TextView)rowView.findViewById(R.id.tvllData);
        TextView descricao = (TextView)rowView.findViewById(R.id.tvllDescricao);
        TextView cat = (TextView)rowView.findViewById(R.id.tvllCategoria);

        quantia.setText(depositos.get(position).getQuantia());
        data.setText(depositos.get(position).getData());
        descricao.setText(depositos.get(position).getDescricao());

        return rowView;
    }
}

