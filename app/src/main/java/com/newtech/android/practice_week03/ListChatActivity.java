package com.newtech.android.practice_week03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.newtech.android.practice_week03.adapter.ChatListAdapter;
import com.newtech.android.practice_week03.model.Product;

import java.util.ArrayList;

public class ListChatActivity extends AppCompatActivity {
    ListView listViewChat;
    ChatListAdapter mChatListAdapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chat);
        listViewChat = findViewById(R.id.listViewChat);
        listViewChat.setLayoutMode(android.R.layout.simple_list_item_1);
        products = new ArrayList<>();
        products.add(new Product("111", "Ca nau lau nau my mini", "Shop Devere", 4.5f, 5000, R.drawable.ca_nau_lau));
        products.add(new Product("111", "Ca nau lau nau my mini", "Shop Devere", 4.5f, 5000, R.drawable.ca_nau_lau));
        mChatListAdapter = new ChatListAdapter(products, this);
        listViewChat.setAdapter(mChatListAdapter);
        mChatListAdapter.notifyDataSetChanged();

    }
}