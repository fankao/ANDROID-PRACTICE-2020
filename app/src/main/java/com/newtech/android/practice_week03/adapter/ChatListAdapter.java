package com.newtech.android.practice_week03.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.newtech.android.practice_week03.R;
import com.newtech.android.practice_week03.model.Product;

import java.util.ArrayList;

public class ChatListAdapter extends BaseAdapter {
    private ArrayList<Product> products;
    private Context context;

    public ChatListAdapter(ArrayList<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Product getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return products.size();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final  ListViewHolder listViewHolder;
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_chat,viewGroup,false);
            listViewHolder = new ListViewHolder(view);
        }else {
            listViewHolder = (ListViewHolder) view.getTag();
        }

        listViewHolder.bind(getItem(i));
        return view;
    }

     class ListViewHolder{
        private TextView txtProductName;
        private ImageView  imageProduct;
        private TextView txtProvider;
        private Button btnChat;

        public ListViewHolder(View view){
            txtProductName  = view.findViewById(R.id.txtProductName);
            txtProvider  = view.findViewById(R.id.txtProvider);
            imageProduct  = view.findViewById(R.id.imageProduct);
            btnChat  = view.findViewById(R.id.btnChat);
            view.setTag(this);
        }

        public void bind(Product product){
            txtProductName.setText(product.getProductName());
            txtProvider.setText(product.getProvider());
            imageProduct.setImageResource(product.getImage());
        }



    }
}
