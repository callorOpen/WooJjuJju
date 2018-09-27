package com.biz.woojjujju.helper;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.biz.woojjujju.MainFragment;

public class MainPageAdapter extends FragmentStatePagerAdapter {

    String[] pageTitle ;

    public MainPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public MainPageAdapter(FragmentManager fm, String[] pageTitle) {
        super(fm);
        this.pageTitle = pageTitle;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//        return super.getPageTitle(position);
        return pageTitle[position];
    }

    @Override
    public Fragment getItem(int i) {
        return new MainFragment();
    }

    @Override
    public int getCount() {
        return pageTitle.length;
    }
}
