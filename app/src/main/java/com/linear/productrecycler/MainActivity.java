package com.linear.productrecycler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    private RecyclerView rvProducts;

    private ProductAdapter adapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();
        productList.add(new Product("Sohel","Ten","1"));
        productList.add(new Product("Robi","Ten","2"));
        productList.add(new Product("Android","Ten","3"));
        productList.add(new Product("Kobir","Ten","4"));
        productList.add(new Product("Masud","Ten","5"));
        productList.add(new Product("Harun","Ten","6"));
        productList.add(new Product("Kabul","Ten","7"));
        productList.add(new Product("Jobbar","Ten","8"));
        productList.add(new Product("Jobdul","Ten","9"));
        productList.add(new Product("Jonyyy","Ten","10"));

        adapter = new ProductAdapter(getApplicationContext(),productList);
        adapter.setListener(this);



        rvProducts = (RecyclerView) findViewById(R.id.rv_students);
        rvProducts.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvProducts.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {

        Product student = productList.get(position);

        Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
        intent.putExtra("student",student);
        intent.putExtra("position",position);

        startActivity(intent);

        Log.d("KKKK",position+"");

    }
}
