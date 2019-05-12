package com.example.apparel.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.apparel.R;
import com.example.apparel.model.Transaction;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListTransactionAdapter extends RecyclerView.Adapter<ListTransactionAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Transaction> listTransaction;

    public ArrayList<Transaction> getListTransaction() {
        return listTransaction;
    }

    public void setListTransaction(ArrayList<Transaction> listTransaction) {
        this.listTransaction = listTransaction;
    }

    public ListTransactionAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_pending_shipment, viewGroup, false);
        //YANG ITEM PENDING SHIPMENT & FINISHED ORDER BLM ADA VIEW NYA
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvNama.setText(getListTransaction().get(position).getNama());
//        categoryViewHolder.tvWarna.setText(getListTransaction().get(position).getWarna());
//        categoryViewHolder.tvAsalProduct.setText(getListTransaction().get(position).getAsalProduct());
//        categoryViewHolder.tvKetBayar.setText(getListTransaction().get(position).getKetBayar());
//        categoryViewHolder.tvTanggalTransaksi.setText(getListTransaction().get(position).getTanggalTransaksi());
//        categoryViewHolder.tvKetSampai.setText(getListTransaction().get(position).getKetSampai());
//        categoryViewHolder.tvTanggalSampai.setText(getListTransaction().get(position).getTanggalSampai());
//        categoryViewHolder.tvUkuran.setText(getListTransaction().get(position).getUkuran());
//        categoryViewHolder.tvJumlah.setText(getListTransaction().get(position).getJumlah());
        categoryViewHolder.tvHarga.setText(getListTransaction().get(position).getHarga());
//        categoryViewHolder.tvTotalHarga.setText(getListTransaction().get(position).getTotalHarga());
        Glide.with(context)
                .load(getListTransaction().get(position).getGambar())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgGambar);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imgGambar;
        TextView tvNama;
        TextView tvUkuran;
        TextView tvWarna;
        TextView tvAsalProduct;
        TextView tvKetBayar;
        TextView tvTanggalTransaksi;
        TextView tvKetSampai;
        TextView tvTanggalSampai;
        TextView tvJumlah;
        TextView tvHarga;
        TextView tvTotalHarga;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGambar = itemView.findViewById(R.id.foto_produk1);
            tvNama = itemView.findViewById(R.id.nama_produk1);
//            tvUkuran = itemView.findViewById(R.id.ukuran_produk1);
            tvWarna = itemView.findViewById(R.id.warna_produk1);
//            tvAsalProduct = itemView.findViewById(R.id.asal_produk1);
//            tvKetBayar = itemView.findViewById(R.id.ket_bayar1);
//            tvTanggalTransaksi = itemView.findViewById(R.id.tanggal_produk1);
//            tvKetSampai = itemView.findViewById(R.id.pengiriman_produk1);
//            tvTanggalSampai = itemView.findViewById(R.id.sampai_produk1);
//            tvJumlah = itemView.findViewById(R.id.jumlah_produk1);
            tvHarga = itemView.findViewById(R.id.harga1);
//            tvTotalHarga = itemView.findViewById(R.id.total_harga1);
        }
    }
}
