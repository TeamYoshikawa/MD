package com.example.nwuser.hillsidegarden;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by nwuser on 2015/11/12.
 */
public class PageManager
        extends FragmentStatePagerAdapter {
    public PageManager(FragmentManager manager) {
        super(manager);

    }

    @Override
    public Fragment getItem(int nowPageNumber){
        switch (nowPageNumber){
            case 0:
                return new Page0();
            case 1:
                return new Page1();
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount(){
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return "Page"+position;
    }
}
