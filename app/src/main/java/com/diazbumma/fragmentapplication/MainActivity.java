package com.diazbumma.fragmentapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

//implement BlankFragment to MainActivity class
public class MainActivity extends AppCompatActivity
        implements BlankFragment.OnFragmentInteractionListener{

    //TextView mHasil;
    // TODO (9) declare new instance TabLayout and ViewPager
    TabLayout mTabLayout;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mHasil = (TextView) findViewById(R.id.text_hasil);

        // TODO (10) Call mTabLayout and mViewPager by findViewById
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.pager);

        //  TODO (11) addTab to mTabLayout
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab A"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab B"));

        // TODO (12) make new PagerAdapter instance
        // TODO (13) set adapter to mVewPager
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(adapter);

        // TODO (18) addOnPageChangeListener
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        // TODO (14) call addOnTableSelctedListener on mTabLayout
        // TODO (15) declare new parameter TabLayout.OnTableSelectedListener
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // TODO (16) setCurrentItem on mViewPager using tab parameter
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(String hasil) {
        //TODO (17) comment mHasil and its instance and findViewById
        //mHasil.setText("RESULT : "+hasil);
    }
}
