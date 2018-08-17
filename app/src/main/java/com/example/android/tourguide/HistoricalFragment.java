package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Rock Ledge Ranch Historic Site", "3105 Gateway Rd",
                "1200 - 1700", R.drawable.rock_ledge));
        locations.add(new Location("McAllister House Museum", "423 N Cascade Ave",
                "1000 - 1600", R.drawable.mcallister_house));
        locations.add(new Location("Rock Ledge Rance Historic Site",
                "3202 Chambers Way","0111 - 2120", R.drawable.rock_ledge_2));
        locations.add(new Location("Colorado Springs Pioneers Museum",
                "215 S Tejon St", "1000 - 1700", R.drawable.pioneers_museum));
        locations.add(new Location("Will Rogers Shrine of the Sun",
                "4250 Cheyenne Mountain Zoo Rd","1100 - 1400",
                R.drawable.shrine_of_the_sun));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
