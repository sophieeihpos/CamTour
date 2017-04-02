package com.example.sophie.camtour;


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
public class HeritageFragment extends Fragment {


    public HeritageFragment() {
        // Required empty public constructor
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_container, container, false);

        ArrayList<Heritage> heritageArrayList = new ArrayList<>();
        heritageArrayList.add(new Heritage(R.string.kings_chapel_name, R.string.kings_chapel_description,R.string.kings_chapel_address,
                R.drawable.kings_college_chapel));
        heritageArrayList.add(new Heritage(R.string.fitsbillies_name, R.string.fizwilliam_museum_description,R.string.fizwilliam_museum_address,R.drawable
                .fizwillian_museum));
        heritageArrayList.add(new Heritage(R.string.bridge_of_sighs_name, R.string.bridge_of_sighs_description,R.string.bridge_of_sighs_address,R.drawable
                .bridge_of_sighs));
        heritageArrayList.add(new Heritage(R.string.mathematical_bridge_name, R.string.mathematical_bridge_description,R.string.mathematical_bridge_address,R.drawable
                .math_bridge));
        heritageArrayList.add(new Heritage(R.string.orchard_garden_name, R.string.orchard_garden_description,R.string.orchard_garden_address, R.drawable
                .orchard_garden));

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(new HeritageArrayAdaptor(getContext(),heritageArrayList));

        return rootView;
    }

}
