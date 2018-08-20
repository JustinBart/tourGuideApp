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
        locations.add(new Location(getString(R.string.rock_ledge),
                getString(R.string.rock_ledge_address),
                getString(R.string.rock_ledge_hours), R.drawable.rock_ledge));
        locations.add(new Location(getString(R.string.mcallister_house),
                getString(R.string.mcallister_house_address),
                getString(R.string.mcallister_house_hours), R.drawable.mcallister_house));
        locations.add(new Location(getString(R.string.rock_ledge_2),
                getString(R.string.rock_ledge_2_address),
                getString(R.string.rock_ledge_2_hours), R.drawable.rock_ledge_2));
        locations.add(new Location(getString(R.string.pioneers_museum),
                getString(R.string.pioneers_museum_address),
                getString(R.string.pioneers_museum_hours), R.drawable.pioneers_museum));
        locations.add(new Location(getString(R.string.will_rogers),
                getString(R.string.will_rogers_address),getString(R.string.will_rogers_hours),
                R.drawable.shrine_of_the_sun));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
