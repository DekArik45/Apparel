package com.example.apparel;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.apparel.adapter.ListTransactionAdapter;
import com.example.apparel.data.ProductData;
import com.example.apparel.data.TransactionData;
import com.example.apparel.model.Transaction;

import java.util.ArrayList;

public class PendingShipmentActivity extends AppCompatActivity {
    RecyclerView mRecylcer;
    private ArrayList<Transaction> list = new ArrayList<>();
    private ArrayList<Transaction> listData = new ArrayList<>();

    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_shipment);

        mRecylcer = findViewById(R.id.shipment_recyclerProduct);
        settingToolbar();
        settingProductAll();
    }

    public void settingProductAll(){

        this.setListData(TransactionData.getListData());

        for (int i=0; i<getListData().size(); i++){
            if (getListData().get(i).getKetSampai().equals("Belum dikirim") || getListData().get(i).getKetSampai().equals("Sedang pengiriman")) {
                list.add(getListData().get(i));
            }
        }

        mRecylcer.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true));
        ListTransactionAdapter productAdapter = new ListTransactionAdapter(this, "Belum dikirim");
        productAdapter.setListTransaction(list);
        mRecylcer.setAdapter(productAdapter);
    }

    public ArrayList<Transaction> getListData() {
        return listData;
    }

    public void setListData(ArrayList<Transaction> listData) {
        this.listData = listData;
    }

    public void settingToolbar(){
        mToolbar = (Toolbar) findViewById(R.id.pending_shipment_toolbar);

        mToolbar.setTitle("Pending Shipment");
        mToolbar.setTitleTextColor(getColor(R.color.colorPrimaryText));
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material);
            upArrow.setColorFilter(Color.argb(255,135,135,135), PorterDuff.Mode.SRC_ATOP);
            getSupportActionBar().setHomeAsUpIndicator(upArrow);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        onBackPressed();
        return true;
    }
}
