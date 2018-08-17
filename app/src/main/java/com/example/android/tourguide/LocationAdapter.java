package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter {

    /**
     * LocationAdapter constructor
     * @param context the context
     * @param locations the location to build
     */
    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get's the location at the given position
        Location currentLocation = (Location) getItem(position);

        // get the name TextView and set it to the location's name a the given position
        TextView locationName = listItemView.findViewById(R.id.name);
        locationName.setText(currentLocation.getName());

        // get the address TextView and set it to the location's name a the given position
        TextView locationAddress = listItemView.findViewById(R.id.address);
        locationAddress.setText(currentLocation.getAddress());

        // get the hours TextView and set it to the location's name a the given position
        TextView locationHours = listItemView.findViewById(R.id.hours);
        locationHours.setText(currentLocation.getHours());

        // get the site_img Image View and if an img is set then display it
        ImageView siteView = listItemView.findViewById(R.id.site_img);

        if (currentLocation.hasImage()) {
            siteView.setImageResource(currentLocation.getImageResourceId());
            siteView.setVisibility(View.VISIBLE);
        } else {
            siteView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
