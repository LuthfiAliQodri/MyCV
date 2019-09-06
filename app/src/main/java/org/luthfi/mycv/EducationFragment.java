package org.luthfi.mycv;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class EducationFragment extends FragmentPagerAdapter {

    private String tab[] = new String[]{"Formal","NonFormal"};

    ArrayList<Fragment> education;


    public EducationFragment(FragmentManager fm , ArrayList<Fragment>fragmentArrayList) {
        super(fm);
        education = fragmentArrayList;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Formal();
            case 1:
                return new NonFormal();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return education.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tab[position];
    }
}
