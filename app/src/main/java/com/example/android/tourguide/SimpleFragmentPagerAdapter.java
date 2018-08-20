package com.example.android.tourguide;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[];

    SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        Resources resource = context.getResources();
        tabTitles = new String[]{resource.getString(R.string.events_title),
                resource.getString(R.string.historical_title),
                resource.getString(R.string.parks_title),
                resource.getString(R.string.restaurants_title)};
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
