package com.linear.productrecycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by IMAT PC-01 on 9/18/2017.
 */

public class DetailActivity extends AppCompatActivity {

    private Product product;
    private int position;

    private ImageView ivPhoto;
    TextView tvName;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        product = (Product) getIntent().getSerializableExtra("product");
        position = getIntent().getIntExtra("position",-1);

        ivPhoto = (ImageView) findViewById(R.id.photo);
        tvName = (TextView) findViewById(R.id.name);

        if(product==null){
            Log.d("HHHH","Product Null");
        }else{
            if (position%2==0){
                ivPhoto.setImageResource(R.drawable.bath);
            }else {
                ivPhoto.setImageResource(R.drawable.food);
            }
            tvName.setText(product.getName());
        }


    }

    }
