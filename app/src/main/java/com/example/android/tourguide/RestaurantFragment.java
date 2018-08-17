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
        locations.add(new Location("Mona Lisa Fondue Restaurant",
                "733 Manitou Ave", "1700 - 2030", R.drawable.mona_lisa));
        locations.add(new Location("The Margarita at Pine Creek",
                "7350 Pine Creek Rd", "1100 - 2030", R.drawable.margarita));
        locations.add(new Location("Thai Mint Restaurant",
                "3202 Chambers Way","1100 - 2100", R.drawable.thai_mint));
        locations.add(new Location("Rock City Cafe",
                "1812 Dominion Way", "0800 - 1500", R.drawable.rock_city_cafe));
        locations.add(new Location("Shangrila Restaurant",
                "8850 N Union Blvd","1100 - 2030", R.drawable.shangrila));
        locations.add(new Location("Piglatin Cocina",
                "2825","1100 - 2030", R.drawable.piglatin));
        locations.add(new Location("Caspian Caafe",
                "4375 Sinton Rd","1100 - 2030", R.drawable.caspian));
        locations.add(new Location("Mountain Shadows Restaurant",
                "2223 W Colorado Ave","1100 - 2030", R.drawable.mountain_shadows));
        locations.add(new Location("MOD Pizza",
                "7447 Academy Blvd N","1100 - 2030", R.drawable.mod));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
