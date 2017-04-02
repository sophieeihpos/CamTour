package com.example.sophie.camtour;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sophie on 2/2/2017.
 */

public class FragmentAdaptor extends FragmentPagerAdapter {

    private Context context=null;

    public FragmentAdaptor(FragmentManager fm, Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {

        if(position==0){ return new HeritageFragment();}
        else if(position==1){return new RestaurantFragment();}
        else if(position==2){return new EventFragment();}
        else {
            return new EntertainmentFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){ return context.getString(R.string.tab0);}
        else if(position==1){return context.getString(R.string.tab1);}
        else if(position==2){return context.getString(R.string.tab2);}
        else {
            return context.getString(R.string.tab3);
        }
    }
}
