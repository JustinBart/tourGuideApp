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
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.rampart), getString(R.string.rampart_address),
                getString(R.string.rampart_hours)));
        locations.add(new Location(getString(R.string.ford_frick),
                getString(R.string.ford_frick_address),
                getString(R.string.ford_frick_hours)));
        locations.add(new Location(getString(R.string.erindale),
                getString(R.string.erindale_address),
                getString(R.string.erindale_hours)));
        locations.add(new Location(getString(R.string.cottonwood),
                getString(R.string.cottonwood_address),
                getString(R.string.cottonwood_hours)));
        locations.add(new Location(getString(R.string.john), getString(R.string.john_address),
                getString(R.string.john_hours)));
        locations.add(new Location(getString(R.string.dublin), getString(R.string.dublin_address),
                getString(R.string.dublin_hours)));
        locations.add(new Location(getString(R.string.nancy), getString(R.string.nancy_address),
                getString(R.string.nancy_hours)));
        locations.add(new Location(getString(R.string.stetson), getString(R.string.stetson_address),
                getString(R.string.stetson_hours)));
        locations.add(new Location(getString(R.string.pitcher), getString(R.string.pitch_address),
                getString(R.string.pitcher_hours)));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
