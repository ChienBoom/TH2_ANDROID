package com.example.th2.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.th2.Fragment.Frag_danhsach;
import com.example.th2.Fragment.Frag_home;
import com.example.th2.Fragment.Frag_thongtin;
import com.example.th2.Fragment.Frag_tktk;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    int pageNumber;
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.pageNumber = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Frag_home();
            case 1:
                return new Frag_danhsach();
            case 2:
                return new Frag_thongtin();
            case 3:
                return new Frag_tktk();
            default: return new Frag_home();
        }
    }

    @Override
    public int getCount() {
        return pageNumber;
    }
}
