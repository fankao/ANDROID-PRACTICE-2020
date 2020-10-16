package com.example.tiki_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements AboveFragment.CallBack {

    private BelowFragment fragmentBelow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragmentAbove = new AboveFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_above, fragmentAbove).commit();

        fragmentBelow = (BelowFragment) getSupportFragmentManager().findFragmentByTag("fragment_below");


    }


    @Override
    public void setPrice(double price) {
        fragmentBelow.setTempPrice(price);
    }
}