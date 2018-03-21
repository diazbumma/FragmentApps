package com.diazbumma.fragmentapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by diazbumma on 21/03/18.
 */

//TODO (5) extend class PagerAdapter by using FragmentStatePagerAdapter
//TODO (6) solve error by clicking red lamp until all supported package imported
public class PagerAdapter extends FragmentStatePagerAdapter{

    //TODO (7) declare numOfTabs integer
    int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        //TODO (8) call fragment using switch statement
        //switch to choose which fragment to display
        switch (position){
            case 0 : return new BlankFragment();
            case 1 : return new SecondFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
