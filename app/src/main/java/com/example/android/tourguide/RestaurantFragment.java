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
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.mona_lisa),
                getString(R.string.mona_lisa_address), getString(R.string.mona_lisa_hours),
                R.drawable.mona_lisa));
        locations.add(new Location(getString(R.string.margarita),
                getString(R.string.margarita_address), getString(R.string.margarity_hours),
                R.drawable.margarita));
        locations.add(new Location(getString(R.string.thai_mint),
                getString(R.string.thai_mint_address), getString(R.string.thai_mint_hours),
                R.drawable.thai_mint));
        locations.add(new Location(getString(R.string.rock_city),
                getString(R.string.rock_city_address), getString(R.string.rock_city_hours),
                R.drawable.rock_city_cafe));
        locations.add(new Location(getString(R.string.shangrila),
                getString(R.string.shangrila_address), getString(R.string.shangrila_hours),
                R.drawable.shangrila));
        locations.add(new Location(getString(R.string.piglatin),
                getString(R.string.piglatin_address), getString(R.string.piglatin_hours),
                R.drawable.piglatin));
        locations.add(new Location(getString(R.string.caspian),
                getString(R.string.caspian_address), getString(R.string.caspian_hours),
                R.drawable.caspian));
        locations.add(new Location(getString(R.string.shadows),
                getString(R.string.shadows_address), getString(R.string.shadows_hours),
                R.drawable.mountain_shadows));
        locations.add(new Location(getString(R.string.mod),
                getString(R.string.mod_address), getString(R.string.mod_hours), R.drawable.mod));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
