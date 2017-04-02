package com.example.sophie.camtour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Sophie on 2/4/2017.
 */

public class EventFragment extends Fragment {
    public EventFragment(){
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_container,container,false);

        ArrayList<RestaurantEvent> restaurantEventArrayList = new ArrayList<RestaurantEvent>();
        restaurantEventArrayList.add(new RestaurantEvent(R.string.open_cambridge_name,R.string.open_cambridge_description));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.science_festival_name,R.string.science_festival_description));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.festival_of_ideas_name,R.string.festival_of_ideas_description));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.twilight_museums_name,R.string.twilight_at_the_museums_description));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.summer_museums_name, R.string.summer_at_the_museums_description));
        ListView listView= (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(new RestaurantEventArrayAdaptor(getContext(), restaurantEventArrayList));
        return rootView;
    }
}
