package com.example.mostafa.alafen;

import java.util.Locale;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MenuActivity extends ActionBarActivity implements View.OnClickListener,ActionBar.TabListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

      /*  final ActionBar actionBar = getSupportActionBar();
        //actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.topbanner));





      //  actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setIcon(R.drawable.search).setTabListener(this));
        actionBar.addTab(actionBar.newTab().setIcon(R.drawable.active).setTabListener(this));
        actionBar.addTab(actionBar.newTab().setIcon(R.drawable.bus).setTabListener(this));*/
        initActionBar();




    }
    protected void initActionBar()
    {
        RelativeLayout custom = new RelativeLayout(getApplicationContext());
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(android.app.ActionBar.LayoutParams.MATCH_PARENT, android.app.ActionBar.LayoutParams.MATCH_PARENT);
        custom.setLayoutParams(params);

        custom.setGravity(Gravity.CENTER);
        custom.setBackgroundDrawable(getResources().getDrawable(R.drawable.topbanner));

        ImageView image =new ImageView(getApplicationContext());
        image.setBackgroundResource(R.drawable.topbanner);
        custom.addView(image);

       ActionBar ab = getSupportActionBar();
        ActionBar.Tab tab_connect;
        ActionBar.Tab tab_discover;
        ActionBar.Tab tab_simplify;


        ab.setDisplayShowCustomEnabled(true);
        ab.setCustomView(custom);
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        tab_connect = ab.newTab();
        tab_connect.setIcon(getResources().getDrawable(R.drawable.search));
        tab_connect.setTabListener(this);

        tab_discover = ab.newTab();
        tab_discover.setIcon(getResources().getDrawable(R.drawable.active));
        tab_discover.setTabListener(this);

        tab_simplify= ab.newTab();
        tab_simplify.setIcon(getResources().getDrawable(R.drawable.bus));
        tab_simplify.setTabListener(this);

        ab.addTab(tab_simplify);
        ab.addTab(tab_discover);
        ab.addTab(tab_connect);

        ab.setDisplayShowTitleEnabled(false);
        ab.setDisplayShowHomeEnabled(false);

    }


    @Override
    public void onClick(View v) {

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {


    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
