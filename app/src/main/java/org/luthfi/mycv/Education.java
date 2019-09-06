package org.luthfi.mycv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Education extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ArrayList<Fragment> education = new ArrayList<>();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        education.add(new Formal());
        education.add(new NonFormal());
        EducationFragment educationFragment = new EducationFragment(getSupportFragmentManager(), education);

        ViewPager viewPager = findViewById(R.id.view2);
        viewPager.setAdapter(educationFragment);

        // rest of code

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
