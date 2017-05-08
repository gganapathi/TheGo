package com.thego;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thego.adapters.MainPagerAdapter;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    MainPagerAdapter mainPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());

        viewPager = (ViewPager)findViewById(R.id.pager);
        viewPager.setOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {

                    }
                });
        viewPager.setAdapter(mainPagerAdapter);

    }
}
