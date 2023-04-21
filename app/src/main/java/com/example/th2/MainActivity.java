package com.example.th2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.th2.Adapter.ViewPagerAdapter;
import com.example.th2.FragmentAdapter.Frag_Adapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom);
        viewPager = findViewById(R.id.view);
        Frag_Adapter adapter = new Frag_Adapter(getSupportFragmentManager(),4);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                switch (position){
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.home).setCheckable(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.danhsach).setCheckable(true);
                        break;
                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.thongtin).setCheckable(true);
                        break;
                    case 3:
                        bottomNavigationView.getMenu().findItem(R.id.thongKe).setCheckable(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.danhsach:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.thongtin:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.thongKe:
                        viewPager.setCurrentItem(3);
                        break;
                }
                return true;
            }
        });
    }
}