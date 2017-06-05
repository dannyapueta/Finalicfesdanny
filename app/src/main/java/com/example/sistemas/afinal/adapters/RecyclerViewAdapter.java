package com.example.sistemas.afinal.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sistemas.afinal.R;
import com.example.sistemas.afinal.model.Pojo;

import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.cardViewHolder>{

    private ArrayList<Pojo> dataset;

    private Context context;

    private Activity activity;

    public RecyclerViewAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    /**
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public cardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new cardViewHolder(view);
    }

    /**
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(cardViewHolder holder, int position) {
        Pojo p = dataset.get(position);
        holder.txtNombreInstitucion.setText(p.getInstitucioneducativa());
        holder.txtMatematicas.setText(p.getMatematicas());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void adicionarLista(ArrayList<Pojo> lista) {
        dataset.addAll(lista);
        notifyDataSetChanged();
    }

    public class cardViewHolder extends RecyclerView.ViewHolder{

        private TextView txtNombreInstitucion;
        private TextView txtMatematicas;

        public cardViewHolder(View itemView) {
            super(itemView);

            txtNombreInstitucion = (TextView) itemView.findViewById(R.id.txt_valor_institucion);
            txtMatematicas       = (TextView) itemView.findViewById(R.id.txt_valor_materia);

        }
    }


}
