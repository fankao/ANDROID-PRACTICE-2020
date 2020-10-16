package com.example.tiki_layout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BelowFragment extends Fragment {

    TextView txtTempPrice;


    public BelowFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_below, container, false);
        txtTempPrice = view.findViewById(R.id.txtTempPrice);
        return view;
    }

    public void setTempPrice(double price){
        txtTempPrice.setText(price+"");
    }
}