package com.example.mostafa.alafen;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class TabsActivity extends ActionBarActivity {
     TabHost tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        tabs = (TabHost)findViewById(R.id.tabHost);
        tabs.setup(); // Start to build tabs
        TabHost.TabSpec spec1 = tabs.newTabSpec("Tab1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("",getResources().getDrawable(R.drawable.search));
        tabs.addTab(spec1);

        TabHost.TabSpec spec2 = tabs.newTabSpec("Tab2");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("",getResources().getDrawable(R.drawable.active));
        tabs.addTab(spec2);

        TabHost.TabSpec spec3 = tabs.newTabSpec("Tab3");
        spec3.setContent(R.id.tab3);
        spec3.setIndicator("",getResources().getDrawable(R.drawable.bus));
        tabs.addTab(spec3);

        /*for (int i = 0; i < tabs.getTabWidget().getTabCount(); i++) {
            tabs.getTabWidget().getChildAt(i).getLayoutParams().height = 100;
        }*/
        for (int i = 0; i < tabs.getTabWidget().getChildCount(); i++)
        {
            tabs.getTabWidget().getChildAt(i).setPadding(0,0,0,0);
        }
    }


}
