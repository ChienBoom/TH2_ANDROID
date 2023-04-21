package com.example.th2.FragmentAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.th2.Fragment.Frag_danhsach;
import com.example.th2.Fragment.Frag_home;
import com.example.th2.Fragment.Frag_thongtin;
import com.example.th2.Fragment.Frag_tktk;


public class Frag_Adapter extends FragmentPagerAdapter {
    private int pageNumber;
    public Frag_Adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.pageNumber = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Frag_home frag_home = new Frag_home();
                return frag_home;
            case 1:
                Frag_danhsach frag_danhsach = new Frag_danhsach();
                return frag_danhsach;
            case 2:
                Frag_thongtin frag_thongtin = new Frag_thongtin();
                return frag_thongtin;
            case 3:
                Frag_tktk frag_tktk = new Frag_tktk();
                return frag_tktk;
        }
        return null;
    }

    @Override
    public int getCount() {
        return pageNumber;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "HOME";
            case 1:
                return "DANH SACH";
            case 2:
                return "THONG TIN";
            case 3:
                return "TIM KIEM THONG KE";
        }
        return null;
    }
}
