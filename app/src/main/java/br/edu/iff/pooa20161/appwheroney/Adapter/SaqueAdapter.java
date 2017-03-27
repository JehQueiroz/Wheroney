package br.edu.iff.pooa20161.appwheroney.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.lang.Float;
import java.util.Date;

import br.edu.iff.pooa20161.appwheroney.Model.SaqueModel;

import br.edu.iff.pooa20161.appwheroney.Model.CategoriaModel;
import br.edu.iff.pooa20161.appwheroney.R;

/**
 * Created by Jessica on 26/03/2017.
 */
public class SaqueAdapter extends ArrayAdapter<SaqueModel> {
    private final Context context;
    private final ArrayList<SaqueModel> saques;

    public SaqueAdapter(Context context, ArrayList<SaqueModel>saques)
    {
        super(context, R.layout.linha_saque, saques);
        this.context = context;
        this.saques = saques;
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.linha_saque, parent, false);

        TextView quantia = (TextView)rowView.findViewById(R.id.tvllQuantia);
        TextView data = (TextView)rowView.findViewById(R.id.tvllData);
        TextView descricao = (TextView)rowView.findViewById(R.id.tvllDescricao);
        TextView cat = (TextView)rowView.findViewById(R.id.tvllCategoria);

        quantia.setText(saques.get(position).getQuantia());
        data.setText(saques.get(position).getData());
        descricao.setText(saques.get(position).getDescricao());

        return rowView;
    }
}
