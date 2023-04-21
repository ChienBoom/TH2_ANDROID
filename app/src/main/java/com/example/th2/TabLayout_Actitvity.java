package com.example.th2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.th2.Adapter.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class TabLayout_Actitvity extends AppCompatActivity {

    TextView title;
    TabLayout tabLayout;
    ViewPager viewPager;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        title = findViewById(R.id.title);
        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.view);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),4);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        tabLayout.setTabTextColors(android.R.color.black,getResources().getColor(android.R.color.white));
                        break;
                    case 1:
                        tabLayout.setTabTextColors(android.R.color.black,getResources().getColor(android.R.color.white));
                        break;
                    case 2:
                        tabLayout.setTabTextColors(android.R.color.black,getResources().getColor(android.R.color.white));
                        break;
                    case 3:
                        tabLayout.setTabTextColors(android.R.color.black,getResources().getColor(android.R.color.white));
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}