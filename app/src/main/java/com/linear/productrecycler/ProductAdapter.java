package com.linear.productrecycler;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by IMAT PC-01 on 9/18/2017.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder> {

    private Context context;
    private List<Product> productList;
    private LayoutInflater inflater;

    private ItemClickListener listener;


    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ProductHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.single_product,parent,false);

        ProductHolder holder = new ProductHolder(view);
        return holder;
    }

    public void setListener(ItemClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(ProductHolder holder,int position) {
        Product product = productList.get(position);

        holder.tvName.setText(product.getName());
        holder.tvProductName.setText(product.getProductName());
        holder.tvPrice.setText(product.getPrice());

        if(position%2==0){
            holder.imageView.setImageResource(R.drawable.bath);
        }else{
            holder.imageView.setImageResource(R.drawable.food);
        }

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ProductHolder extends RecyclerView.ViewHolder{

        TextView tvName,tvProductName,tvPrice;
        ImageView imageView;

        public ProductHolder(View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.name);
            tvProductName = itemView.findViewById(R.id.product_name);
            tvPrice = itemView.findViewById(R.id.price);

            imageView = itemView.findViewById(R.id.photo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(listener!=null){
                        listener.onItemClick(getAdapterPosition());
                    }
                }
            });
        }
    }


}
