package com.example.apparel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apparel.adapter.ListTransactionAdapter;
import com.example.apparel.adapter.ProductCategoryAdapter;
import com.example.apparel.data.ProductData;
import com.example.apparel.data.TransactionData;
import com.example.apparel.model.ProductModel;
import com.example.apparel.model.Transaction;

import java.util.ArrayList;

public class PendingPaymentActivity extends AppCompatActivity {

    RecyclerView mRecylcer;
    private ArrayList<Transaction> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_payment);

        mRecylcer = findViewById(R.id.pending_recyclerProduct);

        settingProductAll();
    }

    public void settingProductAll(){
        list.addAll(TransactionData.getListData());
        mRecylcer.setLayoutManager(new GridLayoutManager(this, 3));
        ListTransactionAdapter productAdapter = new ListTransactionAdapter(this);
        productAdapter.setListTransaction(list);
        mRecylcer.setAdapter(productAdapter);
    }

}
