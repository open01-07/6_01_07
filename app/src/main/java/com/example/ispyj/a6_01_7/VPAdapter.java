package com.example.ispyj.a6_01_7;

//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class VPAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> items;

    public VPAdapter(FragmentManager fm) {
        super(fm);
        items=new ArrayList<>();
        items.add(new Fragment1());
        items.add(new Fragment2());
        items.add(new Fragment3());
        items.add(new Fragment4());
    }

    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
