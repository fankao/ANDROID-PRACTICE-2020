package com.newtech.android.practice_week03.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.newtech.android.practice_week03.R;
import com.newtech.android.practice_week03.model.Product;

import java.util.ArrayList;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductViewHolder> {
    private ArrayList<Product> mProducts;
    private Context mContext;

    public ProductListAdapter(ArrayList<Product> products, Context context) {
        mProducts = products;
        mContext = context;
    }

    @NonNull
    @Override
    public ProductListAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductListAdapter.ProductViewHolder holder, int position) {
        holder.bind(mProducts.get(position));
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageProduct;
        private TextView txtProductName;
        private RatingBar mRatingBar;
        private TextView txtCountRating;
        private TextView txtPrice;
        private TextView txtDiscount;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            imageProduct = itemView.findViewById(R.id.imageProduct);
            txtProductName = itemView.findViewById(R.id.txtProductName);
            mRatingBar = itemView.findViewById(R.id.ratingBar);
            txtCountRating = itemView.findViewById(R.id.txtCountRating);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            txtDiscount = itemView.findViewById(R.id.txtDiscount);
        }

        public void bind(Product product) {
            imageProduct.setImageResource(product.getImage());
            txtProductName.setText(product.getProductName());
            mRatingBar.setRating(product.getRating());
            txtCountRating.setText(15 + "");
            txtPrice.setText(product.getPrice() + "");
            txtPrice.setText("-" + product.getDiscount());
        }
    }
}
