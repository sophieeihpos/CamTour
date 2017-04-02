package com.example.sophie.camtour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sophie on 2/4/2017.
 */

public class RestaurantEventArrayAdaptor extends ArrayAdapter<RestaurantEvent> {
    public RestaurantEventArrayAdaptor(Context context, ArrayList<RestaurantEvent> restaurantEventList) {
        super(context, 0, restaurantEventList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView = convertView;
        if(rootView==null){
            rootView=LayoutInflater.from(getContext()).inflate(R.layout.restaurant_event_list_item,parent,false);
        }
        RestaurantEvent restaurantEvent = getItem(position);
        ImageView image= (ImageView) rootView.findViewById(R.id.restaurant_event_image);
        TextView name = (TextView) rootView.findViewById(R.id.restaurant_event_name);
        TextView category = (TextView) rootView.findViewById(R.id.restaurant_event_category);
        TextView description=(TextView) rootView.findViewById(R.id.restaurant_event_description);

        LinearLayout.LayoutParams nameParams = (LinearLayout.LayoutParams) name.getLayoutParams();

        if(restaurantEvent.hasImage()){
            image.setImageResource(restaurantEvent.getImageID());
            image.setVisibility(View.VISIBLE);
        }else{
            image.setVisibility(View.GONE);
        }
        name.setText(restaurantEvent.getNameID());
        if(restaurantEvent.hasCategory()){
            category.setVisibility(View.VISIBLE);
            category.setText(restaurantEvent.getCategoryID());
        }else{
            category.setVisibility(View.GONE);
            nameParams.bottomMargin=12;
        }
        description.setText(restaurantEvent.getDescriptionID());
        return rootView;
    }
}
