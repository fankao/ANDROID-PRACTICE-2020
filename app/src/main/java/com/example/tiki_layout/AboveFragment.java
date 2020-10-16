package com.example.tiki_layout;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


public class AboveFragment extends Fragment {
    TextView txtQuantity,txtPrice;
    ImageButton btnIncre, btnDecre;

    private CallBack callBack;
    private int count = 0;

    public interface  CallBack{
        void setPrice(double price);
    }

    public AboveFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         callBack  = (CallBack) getContext();
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_above, container, false);
        txtQuantity = view.findViewById(R.id.txtQuantity);
        txtPrice = view.findViewById(R.id.txtPrice);
        btnIncre = (ImageButton) view.findViewById(R.id.btnIncre);
        btnDecre = (ImageButton)view.findViewById(R.id.btnDecre);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        btnIncre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtQuantity.setText((++count)+"");
                Log.d("TAG",count+"");
                double price = Double.parseDouble(txtPrice.getText().toString());
                callBack.setPrice(price*count);
            }
        });

        btnDecre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtQuantity.setText((--count)+"");
                Log.d("TAG",count+"");
                if(getCount() == 1){
                    setCount(1);
                }
                double price = Double.parseDouble(txtPrice.getText().toString());
                callBack.setPrice(price*getCount());
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        callBack = null;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}