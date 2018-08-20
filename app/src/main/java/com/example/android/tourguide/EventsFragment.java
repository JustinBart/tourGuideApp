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
        locations.add(new Location(getString(R.string.birday_party),
                getString(R.string.birthday_address),
                getString(R.string.birday_event_time)));
        locations.add(new Location(getString(R.string.reading_group),
                getString(R.string.reading_group_address),
                getString(R.string.reading_group_event_time)));
        locations.add(new Location(getString(R.string.togo_party),
                getString(R.string.togo_party_address),
                getString(R.string.togo_party_event_time)));
        locations.add(new Location(getString(R.string.code_off),
                getString(R.string.code_off_address),
                getString(R.string.code_off_event_time)));
        locations.add(new Location(getString(R.string.bbq), getString(R.string.bbq_address),
                getString(R.string.bbq_event_time)));
        locations.add(new Location(getString(R.string.music_fest),
                getString(R.string.music_fest_address),
                getString(R.string.music_fest_event_time)));
        locations.add(new Location(getString(R.string.party), getString(R.string.party_address),
                getString(R.string.party_event_time)));
        locations.add(new Location(getString(R.string.card_game),
                getString(R.string.card_game_address),
                getString(R.string.card_game_event_time)));
        locations.add(new Location(getString(R.string.baseball_game),
                getString(R.string.baseball_game_address),
                getString(R.string.baseball_game_event_time)));
        locations.add(new Location(getString(R.string.wine_off),
                getString(R.string.wine_off_address),
                getString(R.string.wine_off_event_time)));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
