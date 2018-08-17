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
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Birthday Party", "123 party st",
                "1100 - 1400"));
        locations.add(new Location("Reading group", "321 reading rd.",
                "2000 - 2100"));
        locations.add(new Location("Togo Party", "1283 Rome st",
                "0111 - 2120"));
        locations.add(new Location("Code off", "0101 Bit st",
                "0101 - 1010"));
        locations.add(new Location("BBQ", "1 Ribs st",
                "1100 - 1400"));
        locations.add(new Location("Music Fest", "55 E. Cord st",
                "1700 - 1800"));
        locations.add(new Location("Party", "55551 N. Vist st",
                "1100 - 1400"));
        locations.add(new Location("Card Game", "3 Magic st",
                "1100 - 1400"));
        locations.add(new Location("Baseball Game", "123 Pitcher pk.",
                "1100 - 1400"));
        locations.add(new Location("Wine off", "123 Wine'o st",
                "1100 - 1400"));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
