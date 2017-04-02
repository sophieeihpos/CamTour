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

public class RestaurantFragment extends Fragment {
    public RestaurantFragment(){
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_container,container,false);

        ArrayList<RestaurantEvent> restaurantEventArrayList = new ArrayList<RestaurantEvent>();
        restaurantEventArrayList.add(new RestaurantEvent(R.string.the_eagle_name,R.string.the_eagle_category,R.string.the_eagle_description,R.drawable.the_eagle));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.midsummer_house_name,R.string.midsummer_house_category,R.string.midsummer_house_description,R.drawable.midsummer_house));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.michaelhouse_cafe_name,R.string.michaelhouse_cafe_category,R.string.michaelhouse_cafe_description,R.drawable.michaelhouse_cafe));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.rainbow_name,R.string.rainbow_category,R.string.rainbow_cafe_description,R.drawable.rainbow_cafe));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.fitsbillies_name,R.string.rainbow_category,R.string.fitzbillies_description,R.drawable.fitzbillies));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.sticky_beaks_name, R.string.sticky_beaks_category,R.string.sticky_beaks_description,R.drawable.sticky_beaks));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.don_pasquale_name,R.string.don_pasquale_category,R.string.don_pasquale_description,R.drawable.don_pasquale));
        restaurantEventArrayList.add(new RestaurantEvent(R.string.seven_days_name,R.string.seven_days_category,R.string.seven_days_description,R.drawable.seven_days));
        ListView listView= (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(new RestaurantEventArrayAdaptor(getContext(), restaurantEventArrayList));
        return rootView;
    }
}
