package com.example.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.List;

/**
 * Created by 정인섭 on 2017-09-27.
 */


/*
페이저 아답터에 프래그먼터 배열을 넘겨서 동작하게 한다.
 */
public class CustomAdapter extends FragmentStatePagerAdapter {

    List<Fragment> list;

    public CustomAdapter(FragmentManager fm) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch(position){
            case 1 :
                return new SecondFragment();
        }
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
