package com.pikitori.example.albertcamus;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

import com.pikitori.example.albertcamus.ui.MainTabsAdapter;
import com.pikitori.example.albertcamus.ui.MainTabsConfig;

public class MainActivity extends AppCompatActivity {

    private MainTabsAdapter mainTabsAdapter;
    private int indexDefaultTab ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        indexDefaultTab = MainTabsConfig.TABINDEX.FIRST;

        mainTabsAdapter = new MainTabsAdapter(this, (TabHost)findViewById(android.R.id.tabhost), (ViewPager)findViewById(R.id.pager));
        if(indexDefaultTab != MainTabsConfig.TABINDEX.FIRST){
            mainTabsAdapter.selectTab(indexDefaultTab);
        }


    }
}
