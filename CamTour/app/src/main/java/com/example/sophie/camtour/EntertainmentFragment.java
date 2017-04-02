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

public class EntertainmentFragment extends Fragment {
    public EntertainmentFragment(){
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_container,container,false);

        ArrayList<RestaurantEvent> restaurantEventArrayList = new ArrayList<RestaurantEvent>();
        restaurantEventArrayList.add(new RestaurantEvent(R.string.arts_theatre_name,R.string.arts_theatre_description,R.drawable.arts_theatre));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.corn_exchange_name,R.string.corn_exchange_description,R.drawable.corn_exchange));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.leisure_park_name,R.string.leisure_park_description,R.drawable.leisure_park));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.cambridge_junction_name,R.string.cambridge_junction_description,R.drawable.cambridge_juction));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.corpus_playroom_name,R.string.corpus_playroom_description,R.drawable.corpus_playroom));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.adc_theatre_name,R.string.adc_theatre_dexcription,R.drawable.adc_theatre));
        ListView listView= (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(new RestaurantEventArrayAdaptor(getContext(), restaurantEventArrayList));
        return rootView;
    }
}
