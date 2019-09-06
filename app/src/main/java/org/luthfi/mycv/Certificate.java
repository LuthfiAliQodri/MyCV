package org.luthfi.mycv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Certificate extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ArrayList<Fragment>fragments = new ArrayList<>();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);
        fragments.add(new SoloLearn());
        fragments.add(new Dicoding());
        fragments.add(new Udemy());
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),fragments);

        ViewPager viewPager = findViewById(R.id.view1);
        viewPager.setAdapter(fragmentAdapter);

        // rest of code

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }
}
