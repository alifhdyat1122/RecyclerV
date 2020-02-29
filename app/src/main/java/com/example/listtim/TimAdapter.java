package com.example.listtim;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class TimAdapter extends RecyclerView.Adapter<TimAdapter.ViewHolder> {
    private Context context;
    private ArrayList<TimModel> timModels;

    public TimAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<TimModel> getTimModels() {
        return timModels;
    }

    public void setTimModels(ArrayList<TimModel> timModels) {
        this.timModels = timModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist_tim,parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull TimAdapter.ViewHolder holder, final int position) {
        Glide.with(context).load(getTimModels().get(position).logoTim).into(holder.ivLogoTim);
        holder.tvNamaTim.setText(getTimModels().get(position).namaTim);
        holder.btn_Lihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lihattim = new Intent(context, LihatTim.class);
                lihattim.putExtra("deskripsi", getTimModels().get(position).getDeskripsi());
                lihattim.putExtra("namatim", getTimModels().get(position).getNamaTim());
                lihattim.putExtra("logotim", getTimModels().get(position).getLogoTim());
                context.startActivity(lihattim);
            }
        });
        holder.btn_Share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, getTimModels().get(position).getNamaTim());
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                context.startActivity(shareIntent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return getTimModels().size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivLogoTim;
        private TextView tvNamaTim;
        private Button btn_Share,btn_Lihat;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivLogoTim = itemView.findViewById(R.id.image_tim);
            tvNamaTim = itemView.findViewById(R.id.texttim);
            btn_Share = itemView.findViewById(R.id.buttonShare);
            btn_Lihat = itemView.findViewById(R.id.buttonLihat);
        }
    }
}
