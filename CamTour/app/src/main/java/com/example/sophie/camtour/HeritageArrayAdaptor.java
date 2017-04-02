package com.example.sophie.camtour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Sophie on 2/2/2017.
 */

public class HeritageArrayAdaptor extends ArrayAdapter<Heritage> {
    public HeritageArrayAdaptor(Context context, ArrayList heritageList) {
        super(context, 0,heritageList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView=convertView;
        if (listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.heritage_list_item, parent, false);
        }
        Heritage heritage=(Heritage) getItem(position);
        TextView name = (TextView) listItemView.findViewById(R.id.heritage_name);
        TextView description = (TextView) listItemView.findViewById(R.id.heritage_description);
        TextView address = (TextView) listItemView.findViewById(R.id.heritage_address);
        ImageView image = (ImageView) listItemView.findViewById(R.id.heritage_image);

        name.setText(heritage.getNameID());
        description.setText(heritage.getDescriptionID());
        address.setText(heritage.getAddressID());

        if (heritage.hasImage()){
            image.setImageResource(heritage.getImageID());
            image.setVisibility(View.VISIBLE);
        }else{
            image.setVisibility(View.GONE);
        }
        return listItemView;
    }

}

