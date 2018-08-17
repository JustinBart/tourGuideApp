package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    // todo update titles
    private String tabTitles[] = new String[]{"Events", "Historical Sites", "Parks", "Restaurants"};

    SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    // todo update framents
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment();
        } else if (position == 1) {
            return new HistoricalFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new RestaurantFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}
