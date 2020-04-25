package com.example.ispyj.a6_01_7;

//import android.support.v4.view.ViewPager;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ViewPager vp= findViewById(R.id.viewpager);
    VPAdapter adapter=new VPAdapter(getSupportFragmentManager());
    vp.setAdapter(adapter);

    TabLayout tab = findViewById(R.id.tab);
    tab.setupWithViewPager(vp);

    ArrayList<Integer> images=new ArrayList<>();
    images.add(R.drawable.dogicon);
    images.add(R.drawable.caticon);
    images.add(R.drawable.rabbiticon);
    images.add(R.drawable.horseicon);

        for(int i=0;i<4;i++) tab.getTabAt(i).setIcon(images.get(i));
    }
}

