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
        locations.add(new Location("Rampart Park", "7850 N Union Blvd",
                "0600 - 1800"));
        locations.add(new Location("Ford Frick Park", "8025 N Union Blvd",
                "0600 - 1800"));
        locations.add(new Location("Erindale Park", "1705 Twin Oaks Dr",
                "0600 - 1800"));
        locations.add(new Location("Cttonwood Creek Park", "7040 Rangewood Dr",
                "0600 - 1800"));
        locations.add(new Location("John Venezia Community Park", "3555 Briargate Pkwy",
                "0600 - 1800"));
        locations.add(new Location("Dublin Park", "2450 Roundtop Dr",
                "0600 - 1800"));
        locations.add(new Location("Nancy Lewis Park", "Colorado Springs",
                "0600 - 1800"));
        locations.add(new Location("Stetson Park", "4870 Jedediah Smith Rd",
                "0600 - 1800"));
        locations.add(new Location("Baseball Game", "123 Pitcher pk.",
                "0600 - 1800"));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
