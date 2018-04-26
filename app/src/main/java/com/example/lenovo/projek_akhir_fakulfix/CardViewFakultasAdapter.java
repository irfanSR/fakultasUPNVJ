package com.example.lenovo.projek_akhir_fakulfix;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by lenovo on 20/10/2017.
 */

    public class CardViewFakultasAdapter extends RecyclerView.Adapter<CardViewFakultasAdapter.CardViewViewHolder>{

    private ArrayList<Fakultas> listFakultas;
    private Context context;

    public CardViewFakultasAdapter(Context context){
        this.context = context;
    }
    public ArrayList<Fakultas> getListFakultas(){ return listFakultas; }
    public void setListFakultas (ArrayList<Fakultas> listFakultas)
    {
        this.listFakultas = listFakultas;
    }

    @Override
                public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_fakultas, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {
        Fakultas p = getListFakultas().get(position);
        Glide.with(context)
                .load(p.getPhoto())
                .override(350, 350)
                .into(holder.imgPhoto);

        holder.tvName.setText(p.getName());
        holder.tvTempat.setText(p.getTempat());
        holder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback()
        {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite "+getListFakultas().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {

                Fakultas fakultas = listFakultas.get(position);

                Intent intent = new Intent(view.getContext(), DetailFakultas.class);

                intent.putExtra(DetailFakultas.KEY_ITEM, fakultas);
                view.getContext().startActivity(intent);

            }
        }));

    }

    @Override
    public int getItemCount() {
        return getListFakultas().size();
    }


    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvTempat;
        Button btnFavorite, btnDetail;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvTempat = itemView.findViewById(R.id.tv_item_tempat);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnDetail = itemView.findViewById(R.id.btn_set_detail);
        }
    }
}
