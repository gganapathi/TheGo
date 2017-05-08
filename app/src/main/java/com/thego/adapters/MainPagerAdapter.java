package com.thego.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.thego.fragments.DashboardFragment;
import com.thego.fragments.ProfileFragment;
import com.thego.fragments.ReviewFragment;

/**
 * Created by Ganapathi on 06-05-2017.
 */

public class MainPagerAdapter extends FragmentStatePagerAdapter {

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                //Fragement for Android Tab
                return new ProfileFragment();
            case 1:
                //Fragment for Ios Tab
                return new DashboardFragment();
            case 2:
                //Fragment for Windows Tab
                return new ReviewFragment();
        }
        return null;

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3; //No of Tabs
    }

}
