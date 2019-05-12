package com.example.apparel.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.apparel.R;
import com.example.apparel.data.ProductData;

import java.util.ArrayList;

public class ItemProductCartAdapter extends RecyclerView.Adapter<ItemProductCartAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<ProductData> listProduct;

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_product_cart, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, final int position) {
//        categoryViewHolder.itemName.setText(getListMakanan().get(position).getTitle());
//        categoryViewHolder.itemDesc.setText(getListMakanan().get(position).getDesc());
//        Glide.with(context)
//                .load(getListMakanan().get(position).getFoto())
//                .apply(new RequestOptions())
//                .into(categoryViewHolder.imgPhoto);

        categoryViewHolder.itemcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(context.getApplicationContext(), DetailActivity.class);
//                i.putExtra("title",getListMakanan().get(position).getTitle());
//                i.putExtra("desc",getListMakanan().get(position).getDesc());
//                i.putExtra("foto",getListMakanan().get(position).getFoto());
//                i.putExtra("recipe", getListMakanan().get(position).getRecipe());
//                i.putExtra("method", getListMakanan().get(position).getMethod());
//                context.startActivity(i);
            }
        });
    }

    public ItemProductCartAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return getListProduct().size();
//        return 0;
    }

    public ArrayList<ProductData> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ArrayList<ProductData> listProduct) {
        this.listProduct = listProduct;
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        CardView itemcard;
        TextView itemName, itemDesc;
        ImageView imgPhoto;
        Button btnFavorite, btnShare;
        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
//            itemcard = itemView.findViewById(R.id.item_cardview);
//            imgPhoto = itemView.findViewById(R.id.item_card_foto);
//            itemName = itemView.findViewById(R.id.item_card_name);
//            itemDesc= itemView.findViewById(R.id.item_card_desc);
//            btnFavorite = itemView.findViewById(R.id.item_card_favorite);
//            btnShare = itemView.findViewById(R.id.item_card_share);
        }
    }


}