package com.example.android.tourguide;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Context context = MainActivity.this;

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // get viewPager
        ViewPager viewPager = findViewById(R.id.viewpager);

        // set's up adapter for the view pager
        SimpleFragmentPagerAdapter adapter =
                new SimpleFragmentPagerAdapter(getSupportFragmentManager(), context);
        viewPager.setAdapter(adapter);

        // get tabLayout
        TabLayout  tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
