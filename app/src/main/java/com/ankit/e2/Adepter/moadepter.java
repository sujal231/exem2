package com.ankit.e2.Adepter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ankit.e2.R;
import com.bumptech.glide.Glide;

public class moadepter extends RecyclerView.Adapter<moadepter.moHolder>{

    Context context;

    @NonNull
    @Override
    public moHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie,parent,false);
        return new moHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull moHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class moHolder extends RecyclerView.ViewHolder{

        TextView txtmoviename,txtmovieyeare,txtmoviemaincast,txtmovieDirector;
        ImageView imgmovie;
        public moHolder(@NonNull View itemView) {
            super(itemView);
            imgmovie = itemView.findViewById(R.id.imgmovie);
            txtmoviename = itemView.findViewById(R.id.txtmoviename);
            txtmovieyeare = itemView.findViewById(R.id.txtmovieyeare);
            txtmoviemaincast = itemView.findViewById(R.id.txtmoviemaincast);
            txtmovieDirector = itemView.findViewById(R.id.txtmovieDirector);
        }
    }
}
