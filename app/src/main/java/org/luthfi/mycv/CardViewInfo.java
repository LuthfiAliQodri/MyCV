package org.luthfi.mycv;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewInfo extends RecyclerView.Adapter<CardViewInfo.ViewHolder> {
    private ArrayList<Info> listInfo;


    public CardViewInfo(ArrayList<Info> listInfo){
        this.listInfo = listInfo;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_info, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int i) {

        final Info info = listInfo.get(i);
        Glide.with(holder.itemView.getContext())
                .load(info.getPhoto())
                .apply(new RequestOptions().override(900,1000))
                .into(holder.imgPhoto);

        holder.tvInfo.setText(info.getInfo());
        holder.tvDeskripsi.setText(info.getDeskripsi());

        holder.card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), InfoDetail.class);
                InfoDetail detail = new InfoDetail();
                intent.putExtra(detail.EXTRA_GAMBAR, info.getPhoto());
                intent.putExtra(detail.EXTRA_INFO, info.getInfo());
                intent.putExtra(detail.EXTRA_DESKRIPSI, info.getDeskripsi());

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return listInfo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView card_View;
        ImageView imgPhoto;
        TextView tvInfo, tvDeskripsi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvInfo = itemView.findViewById(R.id.tv_item_name);
            tvDeskripsi = itemView.findViewById(R.id.tv_desc);
            card_View = itemView.findViewById(R.id.card_view);
        }
    }
}
