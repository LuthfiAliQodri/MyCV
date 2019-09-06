package org.luthfi.mycv;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentPagerAdapter {

    private String tab[] = new String[]{"SoloLearn","Dicoding","Udemy"};

    ArrayList<Fragment> fragment;

    public FragmentAdapter(FragmentManager fm , ArrayList<Fragment>fragmentArrayList) {
        super(fm);
        fragment = fragmentArrayList;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SoloLearn();
            case 1:
                return  new Dicoding();
            case 2:
                return  new Udemy();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return fragment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tab[position];
    }
}
